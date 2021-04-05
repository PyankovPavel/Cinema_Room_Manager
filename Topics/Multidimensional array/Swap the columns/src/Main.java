import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int clmns = sc.nextInt();
        int[][] array = new int[rows][clmns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clmns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int indexOfClmn1 = sc.nextInt();
        int indexOfClmn2 = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clmns; j++) {
                if (j == indexOfClmn1) {
                    int temp = array[i][indexOfClmn1];
                    array[i][indexOfClmn1] = array[i][indexOfClmn2];
                    array[i][indexOfClmn2] = temp;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clmns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}