package lr6;
import java.util.Scanner;

public class example09_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, двойной факториал которого будет рассчитан: ");
        int num = in.nextInt();
        System.out.println("Двойной факториал числа " + num + " равен " + Factorial(num));
        System.out.println("Двойной факториал числа " + num + ", вычисленный ресурсией, равен " + FactorialRec(num));
    }

    static int Factorial(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n-=2;
        }
        return result;
    }
    static int FactorialRec(int n) {
        int result;
        if (n < 3) {
            return n;
        }
        result = FactorialRec(n-2) * n;
        return result;
    }
}
