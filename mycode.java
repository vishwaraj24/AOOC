class Student{
    String name;
    int age;

    public void write(){
        System.out.println("here is the student name");
    }
};

public class mycode {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vishu";
        s1.age = 20;
        s1.write();
    }
}
