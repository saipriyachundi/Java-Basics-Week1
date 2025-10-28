import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        // 1) read inputs
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // 2) choose operation
        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        // 3) compute
        Double result = null;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: division by zero.");
                    sc.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator. Use + - * /");
                sc.close();
                return;
        }

        // 4) print
        System.out.println("Result: " + result);
        sc.close();
    }
}
