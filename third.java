// constructor 
class Std {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // default constructor
    Std(){
        System.out.println("called constructor");
    }
    
    // parameterized constructor
    Std(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class third {
    public static void main(String[] args) {

        Std s1 = new Std("vishu",20);

        

        s1.printinfo();
    }
}