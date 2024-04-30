// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Average{
    public static void AverageOfThreeNumbers(double n){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double avg = (x + y + z) / 3;
        System.out.println("The average of the 3 numbers is : " + avg);
    }
    public static void main(String[] args){
       AverageOfThreeNumbers(5);

    }

}