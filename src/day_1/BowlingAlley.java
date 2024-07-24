package day_1;

import java.util.Scanner;

public class BowlingAlley {
    static final int MAX_CAPACITY = 500;
    static final double NORMAL_TICKET_PRICE = 1500.0;
    static final double VIP_TICKET_PRICE = 2000.0;

    static int currentOccupancy = 0;
    static double moneyRaised = 0.0;

    public static void main(String[] args) {
        handleBowlingAlley();
    }
    public static void handleBowlingAlley() {
        Scanner scanner = new Scanner (System.in);
        int option;

        do {
            printMenu();
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    enterData(scanner);
                    break;
                case 2:
                    showAvailableCapacity();
                    break;
                case 3:
                    showMoneyRaised();
                    break;
                case 0:
                    System.out.println("Logging out of the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    } //end of handleBowlingAlley method


    public static void printMenu() {
        System.out.println("\n=== Bowling Alley Management ===");
        System.out.println("1. Data entry");
        System.out.println("2. Available capacity");
        System.out.println("3. Money raised");
        System.out.println("0. Log out of the system");
    }

    public static void enterData(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter ID: ");
        String id = scanner.next();

        System.out.print("Enter pass type (none, VIP, discount): ");
        String passType = scanner.next().toLowerCase();

        if (age < 21) {
            System.out.println("Entry denied. Must be 21 or older.");
            return;
        }

        if (currentOccupancy >= MAX_CAPACITY) {
            System.out.println("Entry denied. Maximum capacity reached.");
            return;
        }

        System.out.print("Enter ticket type (normal, VIP): ");
        String ticketType = scanner.next().toLowerCase();

        double ticketPrice = 0.0;

        switch (ticketType) {
            case "normal":
                ticketPrice = NORMAL_TICKET_PRICE;
                break;
            case "vip":
                ticketPrice = VIP_TICKET_PRICE;
                break;
            default:
                System.out.println("Invalid ticket type. Please try again.");
                return;
        }

        switch (passType) {
            case "vip":
                ticketPrice = 0.0;
                break;
            case "discount":
                ticketPrice /= 2;
                break;
            case "none":
                // no change to ticketPrice
                break;
            default:
                System.out.println("Invalid pass type. Please try again.");
                return;
        }

        currentOccupancy++;
        moneyRaised += ticketPrice;

        System.out.println("Welcome " + name + "! Enjoy your time at the bowling alley.");
    }
        public static void showAvailableCapacity() {
            int availableCapacity = MAX_CAPACITY - currentOccupancy;
            System.out.println("Available capacity: " + availableCapacity);
        }


        public static void showMoneyRaised() {
            System.out.println("Money raised: $" + moneyRaised);
        }
    }



