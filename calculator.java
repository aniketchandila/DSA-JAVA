//import Scanner class
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter operator");
    char c=sc.next().charAt(0);
    System.out.println("enter the second number");
    int b=sc.nextInt();
        //applying switches on operators
    switch(c){
        case '+' :System.out.println(a+b);
                break;
        case '-' :System.out.println(a-b);
                break;
        case '*' :System.out.println(a*b);
                break;
        case '/' :System.out.println(a/b);
                break;
        case '%' :System.out.println(a%b);
                break;
        default  :System.out.println("invalid input");
    }             

    }
}
