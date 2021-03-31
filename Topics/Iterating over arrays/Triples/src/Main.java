import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = size - 1; i > 0; i--) {
            if(i == 1){
                break;
            }
            if (arr[i] - arr[i - 1] == 1) {
                int a = arr[i - 1];
                int b = arr[i - 2];
                if (a - b == 1) {
                    count++;
                } else {
                    continue;
                }
            } else {
                continue;
            }

        }
        System.out.println(count);
    }
}