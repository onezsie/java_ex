package lr4;
import java.util.Random;

// В программе создается двумерный массив, который инициализируется змейкой
public class example09_07 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[7][9];
        int counter = 10;
        boolean flag = false; // Переменная для чредования вариантов заполнения массива
        for (int i = 0; i < arr.length; i++) {
            if (!flag) {
                for (int j = 0; j < arr[0].length; j++) { // Заполняем с лева на право
                    arr[i][j] = counter;
                    counter++;
                }
                flag = true;
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) { // Заполняем с права на лево
                    arr[i][j] = counter;
                    counter++;
                }
                flag = false;
            }
        }
        for (int[] x : arr) {
            System.out.println();
            for (int y : x) {
                System.out.print(y + "   ");
            }
        }
    }
}
