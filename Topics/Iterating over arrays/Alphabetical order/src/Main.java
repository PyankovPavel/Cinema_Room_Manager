import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int compare = 0;
        for (int i = 0; i + 1 < array.length; i++) {
            compare = array[i].compareTo(array[i + 1]);
        }
        System.out.println(compare <= 0 ? true : false);
    }
}