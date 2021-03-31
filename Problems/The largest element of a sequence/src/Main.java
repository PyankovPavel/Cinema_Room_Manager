import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > num) {
                num = a;
            }
            if (a == 0) {
                break;
            }
        }
        System.out.println(num);
    }
}