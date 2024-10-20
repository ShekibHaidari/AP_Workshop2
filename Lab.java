import java.util.ArrayList;

public class Lab {
    //============================================ Attribute
    private ArrayList<Student> students;
    private String teacherName;
    private String dayOfweek;
    private int max_sizeOfclass ;
    private int current_size;
    private double average;
    //================================================ Constractor
    public Lab(String teacherName, String dayOfweek, int max_sizeOfclass) {
        this.teacherName = teacherName;
        this.dayOfweek = dayOfweek;
        this.max_sizeOfclass = max_sizeOfclass;
        students = new ArrayList<>();
    }
    public Lab(){};







    // ==================================== getter
    public ArrayList<Student> getStudents() {return students;}
    public String getTeacherName() {
        return teacherName;
    }
    public String getDayOfweek() {
        return dayOfweek;
    }
    public int getCurrent_size() {
        return students.size();
    }
    public int getMax_sizeOfclass() { return max_sizeOfclass; }
    public void setAvg(){
        this.average = calculateAvg();
    }
    public double calculateAvg(){
        int sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / (double) getMax_sizeOfclass();
    }








    // ======================================= setter

    public void addStudent(Student student) {
       this.students.add(student);
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void setDayOfweek(String dayOfweek) {
        this.dayOfweek = dayOfweek;
    }
    public void setCurrent_size(int current_size) {
        this.current_size = students.size();;
    }
    public void Setmax_sizeOfclass(int max_sizeOfclass) { this.max_sizeOfclass = max_sizeOfclass; }
    public void setAverage(double average) {
        this.average = average;
    }


    // ===================================== Overrings

    @Override
    public String toString() {
        return "Teacher: " + teacherName + ", Day: " + dayOfweek + ", Max Size of class: " + max_sizeOfclass +
                ", Current Size: " + (students.size()) ;
    }

}
