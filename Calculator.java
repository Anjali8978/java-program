import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first num: ");
        double num1 = in.nextDouble();
        System.out.println("enter second num: ");
        double num2 = in.nextDouble();
        System.out.println("enter operator(+, -, *, %, /): ");
        char operator = in.next().charAt(0);
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("error");
                    return;
                }
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }

}
