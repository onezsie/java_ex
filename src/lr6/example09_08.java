package lr6;
import java.util.Random;

public class example09_08 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.print("Элементы массива: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\nСреднее значение массива arr равно " + ArrayMean(arr));
    }
    static double ArrayMean(int[] arr) {
        double result = 0;
        for (int j : arr) {
            result += j;
        }
        return result / arr.length;
    }

}
