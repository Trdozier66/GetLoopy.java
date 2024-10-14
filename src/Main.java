public class Main {
    public static void main(String[] args) {
        // Execute Task 1
        task1();
        System.out.println(); // Separate output for readability

        // Execute Task 2
        task2();
        System.out.println(); // Separate output for readability

        // Execute Task 3
        task3();
        System.out.println(); // Separate output for readability

        // Execute Task 4
        task4();
        System.out.println(); // Separate output for readability

        // Execute Task 5
        task5();
        System.out.println(); // Separate output for readability

        // Execute Task 6
        task6();
        System.out.println(); // Separate output for readability

        // Execute Task 7
        task7();
        System.out.println(); // Separate output for readability
    }

    // Task 1: Count up by 1 from 0 to 30
    public static void task1() {
        System.out.print("Task 1: ");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
    }

    // Task 2: Count down by 1 from 30 to 0
    public static void task2() {
        System.out.print("Task 2: ");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    // Task 3: Count up by 3 from 0 to 18
    public static void task3() {
        System.out.print("Task 3: ");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
    }

    // Task 4: Count down by 2 from 10 to 0
    public static void task4() {
        System.out.print("Task 4: ");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
    }

    // Task 5: Create a triangle pattern
    public static void task5() {
        System.out.println("Task 5:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Task 6: Create an inverted triangle pattern
    public static void task6() {
        System.out.println("Task 6:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Task 7: Create a square pattern
    public static void task7() {
        System.out.println("Task 7:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
