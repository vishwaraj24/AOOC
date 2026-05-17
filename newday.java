class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write");
    }
    public void printcolor(){
       System.out.println(this.color);
       System.out.println(this.type);
    }

 }
public class newday {
    public static void main(String args[]){
        Pen p1=new Pen();
        Pen p2=new Pen();
        p1.color="green";
        p1.type="gel";
        p1.write();
        p2.color="blue";
        p2.type="ball";
        p2.printcolor();
    }
    
}
