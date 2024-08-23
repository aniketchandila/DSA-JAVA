//function to find factotial
public class factorial1{
    public static void factorial(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact=fact*i;
            }
            System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(5);
        
    }
}

