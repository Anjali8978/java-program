// import java.util.Scanner;

// public class condition_if
// {
//     public static void main(String[]args)
//     {
//         int pwd;
//         System.out.println("Enter your password:=");
//         Scanner obj=new Scanner(System.in);
//         pwd =obj.nextInt();
//         if(pwd==7485)
//         {
//             System.out.println("my name: ajali gour");
//             System.out.println("my age:= 19");
//             System.out.println("my contact:7067260585");
//             System.out.println("my address:spring valley pine dew f101,");
            


//              }

//     }

// }




// if-else statement

import java.util.Scanner;

public class condition_ifelse
{
    public static void  getrestult(String resllt){
        System.out.println(resllt);
    }
    public static void main(String[]args)
    {
        int pwd;
        System.out.println("Enter your password:=");
        try (Scanner obj = new Scanner(System.in)) {
            pwd =obj.nextInt();
        }
        if(pwd==7485)
        {
            System.out.println("my name: anjali gour");
            System.out.println("my age:= 19");
            System.out.println("my contact:7067260585");
            System.out.println("my address:spring valley pine dew f101,");
            


             }
             else
             {
                 System.out.println("sorry! wrong password");
             }


    }

}

