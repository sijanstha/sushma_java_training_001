import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Today's Topic (Fri April 24)
        // Review of Assignment 2
        // Encapsulation
        // Abstraction
        // Inheritance
        // Polymorphism
        // interface and abstract class
        // Build a Music Application using OOP Concept.
        // Problem

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        PasswordChecker passwordChecker = new PasswordChecker();
        boolean flag = passwordChecker.checkPasswordStrength(password);

        if (flag)
            System.out.println("You're good to go!!!");
        else
            System.out.println("Please follow password guideline.!!");

    }
}
