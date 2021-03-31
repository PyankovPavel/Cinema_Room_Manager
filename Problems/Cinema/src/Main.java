import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int seatsInRow = scan.nextInt();
        int[][] cinema = new int[rows][seatsInRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                cinema[i][j] = scan.nextInt();
            }
        }
        int seats = scan.nextInt();
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                if (cinema[i][j] == 0) {
                    for (int k = 0; k < seats; k++) {
                        if (j + k < seatsInRow && cinema[i][j + k] == 0) {
                            counter++;
                        } else {
                            counter = 0;
                            break;
                        }
                    }
                    if (counter == seats) {
                        System.out.println(i + 1);
                        break;
                    }
                }
                if (counter == seats) {
                    break;
                }
            }
            if (counter == seats) {
                break;
            }
        }
        if (counter != seats) {
            System.out.println("0");
        }
    }
}