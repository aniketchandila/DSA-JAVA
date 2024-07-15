//import scanner class
import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        //making object of scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        double a=sc.nextDouble();
        if(a>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
}
