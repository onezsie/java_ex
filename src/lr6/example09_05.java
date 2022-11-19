package lr6;
import java.util.Scanner;

public class example09_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        Square(n);
        System.out.println("Сумма квадратов, вычисленная рекурсией, равна " + SquareRec(n));
    }
    static void Square(int n) {
        int result = 1;
        for (int i = 2; i <=n; i++) {
            result += i*i;
        }
        System.out.println("Сумма квадратов от 1 до n равна " + result);
    }
    static int SquareRec(int n) {
        int result = 1;
        if (n == 1) return 1;
        result = SquareRec(n-1) + (n * n);
        return result;
    }

}
