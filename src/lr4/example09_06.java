package lr4;
import java.util.Random;

// создается двумерный массив, в котором удаляется одна слуачйная строка и столбец (создается новый массив)
public class example09_06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][7];
        int row = random.nextInt(arr.length-1); // номер строки для удаления
        int column = random.nextInt(arr[0].length-1); // номер столбца для удаления
        for (int i = 0; i < arr.length; i++) { //инициализируем исходный массив
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = random.nextInt(9);
            }
        }

        for (int[] x: arr) {
            System.out.println();
            for (int y : x) System.out.print(y + " ");
        }

        System.out.println("\nИз массива будет удалена " + (row + 1) + " строка и " + (column + 1) + " столбец");

        int[][] newArr = new int[arr.length - 1][arr[0].length-1];
        for (int i = 0, x = -1; i < arr.length; i++){ // добавление в новый массив оставшихся строк и столбцов
            if (i == row) {
                continue;
            }
            x++;
            for (int j = 0, y = -1; j < arr[0].length; j++) {
                if (j == column){
                    continue;
                }
                y++;
                newArr[x][y] = arr[i][j];
            }
        }

        for (int[] x : newArr) {
            System.out.println();
            for (int y : x) System.out.print(y + " ");
        }
    }
}
