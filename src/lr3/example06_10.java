package lr3;
import java.util.Scanner;
import java.util.Random;

public class example06_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) { // Заполняем массив случайными числами
            arr[i] = random.nextInt(400);
        }
        System.out.println("Исходный массив: ");
        for(int x : arr) System.out.print(x + " ");
        int tmp;
        for (int j = 0; j < arr.length-1; j++) { // Сортируем массив по убыванию
            for(int k = j+1; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    tmp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        System.out.println("\nОтсортированный массив: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
