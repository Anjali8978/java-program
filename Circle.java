import java.util.Scanner;

public class Circle {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:" );
        double radius = in.nextDouble();
        double area = Math.PI * radius * radius;
        double circumferene = 2 * Math.PI * radius;
        System.out.println("Area of the circle is " +area);
        System.out.println("circumference of the circle is:" +circumferene);
    }
    
}
