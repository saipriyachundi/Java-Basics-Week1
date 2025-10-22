

public class ForLoopExample {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of numbers 1 to 10: " + sum);
    }
    
}
