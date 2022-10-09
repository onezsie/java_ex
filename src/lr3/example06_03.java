package lr3;
import java.util.Scanner;

public class example06_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, соотствующее количеству чисел Фибоначчи, которые вы ходите увидеть: ");
        int num = in.nextInt();

        System.out.println("Реализация с использованием цикла for и массива: ");
        int[] fib = new int[num + 1];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print(fib[1] + " ");
        for (int i = 2; i <= num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }

        System.out.println("\nРеализация с использованием цикла while и тремя переменными: ");
        int result = 1;
        int tmp;
        int prevValue = 0;
        while (num-- > 0) {
            System.out.print(result + " ");
            tmp = result;
            result += prevValue;
            prevValue = tmp;
        }
    }
}
