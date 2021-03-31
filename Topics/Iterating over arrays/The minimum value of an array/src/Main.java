import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int compare = array[i];
            if (min > compare) {
                min = compare;
            }
        }
        System.out.println(min);
    }
}