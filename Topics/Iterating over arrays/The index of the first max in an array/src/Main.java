import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int indexOfMax = 0;
        int max = array[0];
        for (int i = 0; i < size; i++) {
            int compare = array[i];
            if (max < compare) {
                max = compare;
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}