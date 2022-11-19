package lr6;

import java.util.Arrays;

public class example09_09 {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c', 'd', '1', 'И', 'Q'};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Массив после обработки: " + Arrays.toString(ReverseArray(arr)));
    }

    static char[] ReverseArray(char[] arr) {
        char[] result = new char[arr.length];
        for (int i =0; i < arr.length; i++){
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}
