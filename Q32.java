import java.util.Scanner;

public class Q32 {
    private static double balance = 1000.00;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is \u20A6%,.2f%n", balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount > 0) {
                balance += amount;
                System.out.printf("\u20A6%,.2f deposited. New balance is \u20A6%,.2f%n", amount, balance);
            } else {
                System.out.println("Amount must be greater than zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric amount.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("\u20A6%,.2f withdrawn. New balance is \u20A6%,.2f%n", amount, balance);
            } else if (amount <= 0) {
                System.out.println("Amount must be greater than zero.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric amount.");
        }
    }
}
// This ATM program allows users to check their balance, deposit money, and withdraw money.
// It handles invalid inputs and ensures that the user cannot withdraw more than their balance.