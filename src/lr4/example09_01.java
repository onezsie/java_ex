package lr4;

// Прямоугольник, ширина 23, высота 11:
public class example09_01 {
    public static void main(String[] args) {
        int figure = 11;
        int i, j ,z;
        for (i = 1;i <= figure; i++) {
            if (i > 9) {
                System.out.print("Номер строки:" + i + " ");
            }
            else {
                System.out.print("Номер строки: " + i + " ");
            }
            z = 0;
            for (j = - 12; j < figure; j++){
                System.out.print("+");
                z+=1;
            }
            System.out.println(" Символов в строке: " + z);
        }
    }
}
