import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[][] twoDimArr = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                twoDimArr[i][j] = ".";
                if (i == j || i + j == size - 1 || j == size / 2 || i == size / 2) {
                    twoDimArr[i][j] = "*";
                }
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}