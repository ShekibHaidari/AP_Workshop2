public class Student {
    private String name;
    private String lastName;
    private String id;
    private int grade;
    // =============================== constractors
    public Student(String name, String lastName, String id, int grade) {
        this.name = name;
        this.lastName = lastName;
        setId(id);
        this.grade = grade;
    }
    public Student(){}
    // =================================== getter
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }
    // ===================================== setter

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //========================================= Methods
    public void setId(String id) {
        if(id.length() == 7){
            this.id = id;
        }
    }
    // =================================== method

    @Override
    public String toString(){
        return "{ "
                + "\nName : " + this.name
                + "\nlast name: " + " " + this.lastName +
                "\nId: " + id +
                "\nGrade: " + grade
                + "}";
    }

}
