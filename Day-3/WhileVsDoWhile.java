

public class WhileVsDoWhile {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("While Loop:");
        while (i < 5) {
            System.out.println("This will NOT print because the condition is false initially.");
        }

        System.out.println("\nDo-While Loop:");
        do {
            System.out.println("This WILL print once even though the condition is false.");
        } while (i < 5);
    }
    
}
