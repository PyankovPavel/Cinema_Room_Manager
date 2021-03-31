import java.util.*;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {

        int[][] list = new int[twoDimArray.length][twoDimArray[0].length];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                list[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j];
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = list[i][j];
            }
        }
    }
}