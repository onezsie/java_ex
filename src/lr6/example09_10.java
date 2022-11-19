package lr6;
import java.util.Arrays;
import java.util.Random;

public class example09_10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Максимальное и минимальное значение массива arr: " + Arrays.toString(FindMaxMin(arr)));
        System.out.println(Arrays.toString(FindMaxMin(10, 3, 9, 18, 4, 8, -14, -40, 35)));
    }

    static int[] FindMaxMin(int ... arr) {
        int max = arr[0], min = arr[0];
        for (int i =1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        return new int[]{max, min};
    }
}
