package lr4;

// Создается двумрный массив, который выводит прямуольник из цифр 2
public class example09_03 {
    public static void main(String[] args) {
        int[][] arr = new int[4][8];
        for (int i = 0; i < arr.length; i ++){
            System.out.print("Nomer stroki: " + i + " ");
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print("2");
            }
            System.out.println();
        }
    }
}
