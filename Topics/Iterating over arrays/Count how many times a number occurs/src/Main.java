import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}