/*Write a Java program that takes a year from the user and print whether that
year is a leap year or not*/
//import Scanner class
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0) ||(a%400==0 && a%100==0 )){
          System.out.println("its is a leap year "+a);
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}
