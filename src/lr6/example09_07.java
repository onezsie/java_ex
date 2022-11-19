package lr6;

import java.util.Arrays;

public class example09_07 {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c', 'd', '1', 'И', 'Q'};
        System.out.println("Массив с кодами символных элементов из массива arr: " + Arrays.toString(ConvertArray(arr)));
    }
    static int[] ConvertArray(char[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i<result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
