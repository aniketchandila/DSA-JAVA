//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever 

/*public class Solution {
    public static void main(String[] args) {
    double temp = 103.5;
    }
}*/


//import scanner class
import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        double temp = 103.5;
        if(temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You dont have fever");
        }
    }
    
}
