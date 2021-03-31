import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int check = 0;
        for (int i = 0; i >= 0; i++) {
            int a = sc.nextInt();
            sum += a;
            if (sum >= 1000) {
                while (check < 1000) {
                    check = sum;
                }
            }
            if (a == 0) {
                break;
            }
        }
        if (sum >= 1000) {
            check = check - 1000;
            System.out.println(check);
        } else {
            System.out.println(sum);
        }
    }
}