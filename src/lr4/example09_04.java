package lr4;

// Создается двумерный массив, который выводит прямоугольный треугольник
public class example09_04 {
    public static void main(String[] args) {
        int[][] arr = new int[9][];
        int counter = 1;
        int j;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Номер строки: " + (i + 1) + " ");
            for (j = 0; j < counter; j++) {
                System.out.print("+");
            }
            System.out.println(" Символов в строке: " + j);
            counter++;
        }
    }
}
