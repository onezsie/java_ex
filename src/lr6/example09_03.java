package lr6;
import java.util.Random;

class Lab63 {
    static void showInfo(int ... intArr) {
        int max = intArr[0];
        int min = intArr[0];
        int sum = 0;
        for (int i = 1; i < intArr.length; i++) {
            max = Math.max(max, intArr[i]);
            min = Math.min(min, intArr[i]);
            sum += intArr[i];
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Максимальное значение: " + min);
        System.out.println("Среднее значение: " + (sum / intArr.length));
    }
}

public class example09_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.print("Значения массива: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        Lab63.showInfo(arr);
        Lab63.showInfo(6, 2, 10, 34, 8, 54);
    }
}
