package Tugas1_Tes;

import java.util.Scanner;

public class MAINN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the concert hall: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the concert hall: ");
        int cols = scanner.nextInt();

        concerTicketsSystem ticketSystem = new concerTicketsSystem(rows, cols);

        System.out.println("Welcome to the Concert Ticket System!");
        ticketSystem.showSeatPrices();

        char choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. View Available Seats");
            System.out.println("2. Buy Ticket");
            System.out.println("3. View Available Seats Count");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1/2/3/4): ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    ticketSystem.showAvailableSeats();
                    break;
                case '2':
                    System.out.println("Enter row number: ");
                    int row = scanner.nextInt();
                    System.out.println("Enter column number: ");
                    int col = scanner.nextInt();
                    ticketSystem.buyTicket(row, col);
                    break;
                case '3':
                    System.out.println("Available Seats Count: " + ticketSystem.getSeatsAvailable());
                case '4':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != '4');

        scanner.close();
    }
}
