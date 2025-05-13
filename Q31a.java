package student;

import java.util.Scanner;

public class Q31a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter matric number: ");
        String matricNo = scanner.nextLine();

        System.out.print("Enter score: ");
        double score = scanner.nextDouble();

        // Create Student object
        Q31b student1 = new Q31b(name, matricNo, score);

        // Display student information
        student1.displayInfo();

        scanner.close();
    }
}
