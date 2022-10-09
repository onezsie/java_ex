package lr3;
import java.util.Scanner;
import java.util.Random;

public class example06_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) { // Заполняем массив случайными числами
            arr[i] = random.nextInt(200);
        }
        System.out.println("Получившийся массив: ");
        for (int x : arr) System.out.print(x + " ");
        int min = 200;
        for (int j : arr) { // Находим минимальное значение
            if (j < min) min = j;
        }
        System.out.print("\n\nМинимальное значение в массиве: "+min+" \nЕго можно найти по индексам: " );
        for (int i = 0; i < arr.length; i++) { // Находим индекс минимальных значений
            if (arr[i] == min) System.out.print(i + " ");
        }
    }
}
