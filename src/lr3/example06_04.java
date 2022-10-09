package lr3;
import java.util.Scanner;

// Программа запрашивает 2 числа. Выводит все числа (включая исходные) от большего к меньшему
public class example06_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа: ");
        int numOne = in.nextInt();
        int numTwo = in.nextInt();

        System.out.println("Решение через for: ");
        if (numOne < numTwo)
            for (int i = numOne; i <= numTwo; i++) System.out.print(i + " ");
        else if (numOne > numTwo) {
            for (int i = numTwo; i <= numOne; i++) System.out.print(i + " ");
            }
        else System.out.println(numTwo);

        System.out.println("\nРешение через while: ");
        int abs = Math.abs(numOne - numTwo);
        int lower = Math.min(numOne, numTwo);
        while(abs-- >= 0) {
            System.out.print(lower + " ");
            lower++;
        }
    }
}
