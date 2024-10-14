import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rollCount = 0;
        boolean continueRolling = true;

        // Print the header
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        while (continueRolling) {
            // Roll the dice
            int die1 = random.nextInt(6) + 1; // 1 to 6
            int die2 = random.nextInt(6) + 1; // 1 to 6
            int die3 = random.nextInt(6) + 1; // 1 to 6
            rollCount++;

            // Calculate the sum
            int sum = die1 + die2 + die3;

            // Print the result for the current roll
            System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3, sum);

            // Check if all dice are the same (triple)
            if (die1 == die2 && die2 == die3) {
                System.out.println("Triple rolled! Exiting.");
                continueRolling = false;
            } else {
                // Ask user if they want to continue
                System.out.print("Roll again? (y/n): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("y")) {
                    continueRolling = false;
                }
            }
        }

        scanner.close();
    }
}



