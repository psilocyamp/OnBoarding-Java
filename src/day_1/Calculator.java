package day_1;

import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            System.out.println("Select an option: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performAddition(scanner);
                    break;
                case 3:
                    performAddition(scanner);
                    break;
                case 4:
                    performAddition(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the calculator...");
                    break;
                default:
                    System.out.println("Invalid option, please try again");

            }

        }while (option != 0);
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\n=== Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
    }

    public static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }
    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void performDivision(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }





    }
    }