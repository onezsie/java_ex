import java.util.Scanner;
public class example06_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num % 4 == 0 && num >= 10) System.out.println("Ваше число подходит");
        else System.out.println("Ваше число не подходит.");
    }
}
