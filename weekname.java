/*Write a Java program to input week number(1-7) and print day of week name
using switch case.*/

//import scanner class
import java.util.Scanner;
public class weekname {
    public static void main(String[] args) {
       //taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the week number");
        int a=sc.nextInt();
        //applying switch on unput taken from user
        switch(a){
            case 1 :System.out.println("today is monday");
                   break;
            case 2 :System.out.println("today is tuesday");
                   break;
            case 3 :System.out.println("today is wednesday");
                   break;
            case 4 :System.out.println("today is thursday");
                   break;
            case 5 :System.out.println("today is friday");
                   break;
            case 6 :System.out.println("today is saturday");
                   break;

            case 7 :System.out.println("today is sunday");
                   break;
            default:System.out.println("invalid input"); 


        }
    }
}
