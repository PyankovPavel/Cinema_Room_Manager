import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 1;
        int count2 = 1;
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                count1++;
            } else {
                if (count1 >= count2) {
                    count2 = count1;
                }
                count1 = 1;
            }
        }
        System.out.println(count1 > count2 ? count1 : count2);
    }
}