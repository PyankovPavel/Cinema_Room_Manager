package cinema;

import java.util.*;

public class Cinema {

    public static int exactRow;
    public static int exactSeat;
    public static int seats;
    public static int rows;
    public static Scanner sc = new Scanner(System.in);


    public static void buyTicket(char room[][]) {

        System.out.println();
        System.out.println("Enter a row number:");
        exactRow = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        exactSeat = sc.nextInt();
        room[exactRow - 1][exactSeat - 1] = 'B';

        System.out.println();
        if (seats * rows <= 60) {
            System.out.println("Ticket price: $10");
        } else if (seats * rows > 60) {
            if (exactRow <= rows / 2) {
                System.out.println("Ticket price: $10");
            }
            if (exactRow > rows / 2) {
                System.out.println("Ticket price: $8");
            }
        }
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

        while (true) {

            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showSeats(room);
                    break;
                case 2:
                    buyTicket(room);
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