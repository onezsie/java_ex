package lr4;
import java.util.Random;

// Создается двумерный массив, в котором строки и столбцы должны поменяться местами
public class example09_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[4][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int[] x : arr) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("New array: ");
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < newArr.length; i ++){
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        for (int[] x : newArr) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
