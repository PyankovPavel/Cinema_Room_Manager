import java.util.*;

class ArrayOperations {
    public static void main(String[] args) {
        printCorners(new int[3][3]);
    }

    public static void printCorners(int[][] twoDimArray) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(array[0][0] + " " + array[0][b - 1]);
        System.out.println(array[a - 1][0] + " " + array[a - 1][b - 1]);

    }
}