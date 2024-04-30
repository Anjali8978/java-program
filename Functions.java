import java.util.*;

public class Functions {
//     public static void printMyName(String name){
//         System.out.println("my name is :"+name);
//         return;
//     }

//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         String name = in.next();

//         printMyName(name);
//     }
// }

// public static int calculataeSum(int a, int b) {
//     int sum = a+b;
//     return sum;
// }
// public static void main(String[] args){
//     Scanner in = new Scanner(System.in);
//     int a = in.nextInt();
//     int b = in.nextInt();

//     int sum = calculataeSum(a, b);
//     System.out.println("sum of 2 number is:" +sum);
// }
// public static void printFactorial(int n){

//     if(n < 0){
//         System.out.println("invalid number");
//         return;
//     }
//     int fact = 1;

//     for(int i=n;i>=1; i--){
//         fact = fact*i;
//     }
//     System.out.println(fact);
//     return;
// }
// public static void main (String[] args){
//     Scanner in = new Scanner(System.in);
//     int n = in.nextInt();


//     printFactorial(n);
// }
public static void printSumOfOddNum(int n){
    int sum = 0;
    for(int i=1; i<=n; i+=2){
        sum +=i;
    }
    System.out.println("the sum of odd num from 1 to " +n+ "is:" +sum);  

}
    }



