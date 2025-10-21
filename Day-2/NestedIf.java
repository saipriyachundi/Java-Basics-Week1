import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90)
                System.out.println("Grade: A");
            else if (score >= 75)
                System.out.println("Grade: B");
            else if (score >= 65)
                System.out.println("Grade: C");
            else
                System.out.println("Grade: D");
        } else {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        }

        sc.close();
    }
}
