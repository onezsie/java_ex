package lr4;

// Прямоугольный треугольник:
public class example09_02 {
    public static void main(String[] args) {
        int height = 10;
        int counter = 1;
        int j;
        for (int i = 0; i < height; i++) {
            System.out.print("Номер строки: " + i + " ");
            for (j = 0; j < counter; j++) {
                System.out.print("+");
            }
            System.out.println(" Символов в строке: " + j);
            counter++;
        }
    }
}