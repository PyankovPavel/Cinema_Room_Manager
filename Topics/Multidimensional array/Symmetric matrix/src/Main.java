import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int check = 0; // false
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == array[j][i]) {
                    check = 1; // true
                } else {
                    check = 0;
                    break;
                }
            }
            if (check == 0) {
                break;
            }
        }
        if (check == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}