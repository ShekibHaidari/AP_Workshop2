public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Elone","Mask","4023144",19);
        Student s2 = new Student("mark","Zakerberg","4023145",18);
        Student s3 = new Student("Alireza","Biranvand","4023146",16);
        Lab l = new Lab("Amir","Sunday",20);
        l.Setmax_sizeOfclass(10);
        l.addStudent(s1);
        l.addStudent(s2);
        l.addStudent(s3);
        System.out.println(l);

    }
}
