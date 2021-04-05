import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n - 1; i++) {
            long temp = result;
            result = temp * (i + 1);
        }
        if (n == 0) {
            result = 1;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}