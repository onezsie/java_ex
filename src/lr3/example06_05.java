package lr3;
import java.util.Scanner;

public class example06_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int sum = in.nextInt();
        int counter = 0;
        int result = 0;
        System.out.println("Список чисел, удовлетворяющих всем условиям: ");
        for (int i = 0; counter != sum; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                result += i;
                counter++;
            }
        }
        System.out.println("\nСумма чисел: " + result);

        System.out.println("\nРешение с использованием While: ");
        counter = 0;
        result = 0;
        int i = 0;
        while (counter != sum) {
            i++;
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                result += i;
                counter++;
            }
        }
        System.out.println("\nСумма чисел: " + result);
    }
}
