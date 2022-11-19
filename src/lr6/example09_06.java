package lr6;

import java.util.Arrays;

public class example09_06 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println("Массив после обработки: " + Arrays.toString(ChangeArr(arr, 5)));
        System.out.println("Второй массив после обработки: " + Arrays.toString(ChangeArr(new int[]{1, 2, 3, 4, 5}, 10)));

    }
    static int[] ChangeArr(int[] arr, int n) {
        if (n > arr.length) {
            int[] result = new int[arr.length];
            System.arraycopy(arr, 0, result, 0, result.length);
            return result;
        }
        int[] result = new int[n];
        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }

}
