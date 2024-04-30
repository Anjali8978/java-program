import java.util.*;


// public class Condition {
//     public static void main(String [] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("apki age btaiye:");
//         int age = in.nextInt();

//         if(age>18){
//             System.out.println("Ap bade hogye");
//         }else{
//             System.out.println("are yrr ap to chote ho");
//         } 
//     }

// }
// public class Condition{
//     public static void main(String [] args){
//         Scanner in = new Scanner(System.in);
//         int x = in.nextInt();

//         if(x%2==0) {
//             System.out.println("even");
        
//         }else{
//             System.out.println("odd");
//         }
//     }
// }
// public class Condition {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();

//         if(a==b){
//             System.out.println("equal");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a is greater");
//             } else{
//                 System.out.println("a is lesser");
//             }
//         }
//     }
// }



public class Condition {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int button = in.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 :System.out.println("koi hai");
            break;
            case 3 : System.out.println("are you there");
            break;
            default : System.out.println("invalid");
        }

        }
    } 

