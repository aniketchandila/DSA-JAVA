
/**
 * checkprime
 */
//
import java.util.*;
public class checkprime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbe you want to check");
        int a=sc.nextInt();
        boolean isPrime=true;
        if(a==2){
            System.out.println("prime");
        }
        else{
            for(int i=2;i<=(a-1);i++){
                if(a%i==0){
                    isPrime=false;
                  }
                }
            if(isPrime==true){
                System.out.println("prime number");
            }
            else{
                System.out.println("not a prime number");
           
            }
        }
        
    }

}