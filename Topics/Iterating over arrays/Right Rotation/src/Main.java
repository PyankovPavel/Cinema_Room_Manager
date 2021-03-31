import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String[] array = arr.split(" ");
        //System.out.println("Orig array: "+Arrays.toString(array));
        int shift = sc.nextInt();
        Collections.rotate(Arrays.asList(array), shift);
        System.out.println(Arrays.toString(array).replace("[", "").replace("]", "").
                replace(",",""));
    }
}
