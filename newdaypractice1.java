class Student{
    String name;
    int age;

    public void printid() {
       System.out.println(this.name);
       System.out.println(this.age);
    }

    Student(String name,int age ){
        this.name=name;
        this.age=age;
    }

 }
public class newdaypractice1 {
      public static void main(String args[]){
        Student s1=new Student("aman",12);
       
    }
}
