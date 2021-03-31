import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while ((input = sc.nextInt()) != 0) {
            if (input % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }
    }
}