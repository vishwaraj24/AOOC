package Expriments;

public class primecheck {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("enter no");
            return;
        }
        int no = Integer.parseInt(args[0]);
        int count=0;

        for(int i=1;i<=no;i++){
            if(no % i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(no+"is prime");
        }else{
            System.out.println(no+"is prime");
        }

        }
    }
    

