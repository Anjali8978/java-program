import java.util.Scanner;
public class Multipication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for multipiation table:");
        int num = in.nextInt();

        for(int i= 1; i<=10;i++){
            System.out.println(num*i);
        }

    }
    
}
