import java.util.*;
public class PrimeCheck {
    public static void main(String[] args){
        int num;
        boolean isPrime=true;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
         num = in.nextInt();

         for(int i = 2; i<num; i++){
            if(num%i ==0){
                isPrime=false;
                break;

            }
         }
         if(isPrime){
            System.out.println(num + "is prime.");
            }
            else{
                System.out.println(num + "is not prime.");
            }
         }
    }
    
