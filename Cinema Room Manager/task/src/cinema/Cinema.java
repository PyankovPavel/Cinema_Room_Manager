package cinema;

import java.util.*;

public class Cinema {

    public static int exactRow;
    public static int exactSeat;
    public static int seats;
    public static int rows;
    public static int soldTickets = 0;
    public static int totalIncome = 0;
    public static int currentIncome;
    public static Scanner sc = new Scanner(System.in);

    public static void buyTicket(char room[][]) {
        int incomeFromTicket = currentIncome;
        System.out.println();
        System.out.println("Enter a row number:");
        exactRow = sc.nextInt();
        if (exactRow > rows){
            System.out.println("Wrong input!");
            buyTicket(room);
        }
            System.out.println("Enter a seat number in that row:");
        exactSeat = sc.nextInt();
        if (exactSeat > seats){
            System.out.println("Wrong input!");
            buyTicket(room);
        }
        if (room[exactRow - 1][exactSeat - 1] == 'S') {
            room[exactRow - 1][exactSeat - 1] = 'B';
        } else {
            System.out.println("That ticket has already been purchased!");
            soldTickets--;
            buyTicket(room);
        }

        System.out.println();
        if (seats * rows <= 60) {
            System.out.println("Ticket price: $10");
            incomeFromTicket = 10;
        } else if (seats * rows > 60) {
            if (exactRow <= rows / 2) {
                System.out.println("Ticket price: $10");
                incomeFromTicket = 10;
            }
            if (exactRow > rows / 2) {
                System.out.println("Ticket price: $8");
                incomeFromTicket = 8;
            }
        }
        soldTickets++;
        currentIncome += incomeFromTicket;
    }

    public static void showSeats(char room[][]) {

        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= seats; j++) {
                System.out.print(room[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }

    public static void stats(char room[][]) {
        double percentage = (double) (soldTickets * 100) / (seats * rows);
        System.out.println("Number of purchased tickets: " + soldTickets);
        System.out.println(String.format("Percentage: %.2f", percentage) + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }


    public static void main(String[] args) {

        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();
        char[][] room = new char[rows][seats];
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = 'S';
            }
        }
        if (seats * rows > 60) {
            totalIncome = (seats * (rows / 2) * 10) + (seats * ((rows - (rows / 2)) * 8));
        } else {
            totalIncome = seats * rows * 10;
        }


        while (true) {

            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showSeats(room);
                    break;
                case 2:
                    buyTicket(room);
                    break;
                case 3:
                    stats(room);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}