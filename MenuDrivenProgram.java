import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's menu choice and execute the corresponding action
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);

        // Handle the menu choices using conditional statements
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0); // Exit the program
        } else {
            System.out.println("Invalid choice. Please select between 1 and 3.");
        }
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if the number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to continuously display the menu and handle user choices
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid choice (1-3).");
                scanner.next(); // Consume the invalid input
            }
            
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }
}