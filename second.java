class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("pen is writting");
    }
   
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class second {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.color = "green";
        p1.type = "ball";
        p1.printcolor();

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "gel";
        p2.printcolor();
    }
    
}
