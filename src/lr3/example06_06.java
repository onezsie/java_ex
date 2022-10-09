package lr3;
import java.util.Scanner;

public class example06_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (целое число > 0): ");
        int num = in.nextInt();
        if (num > 0) {
            int[] ars = new int[num];
            int value = 2;
            for (int i = 0; i < num; i++) { // Заполняем массив числами удовлетворяющими условию: число % 5 == 2
                ars[i] = value;
                value += 5;
            }
            for (int x : ars) System.out.print(x + " ");
        }
        else System.out.println("Ваше значение некорректное. ");
    }
}
