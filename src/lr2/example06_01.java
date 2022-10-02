package lr2;

import java.util.Scanner;
public class example06_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки, делится ли оно на 3");
        int num = in.nextInt();
        if (num % 3 == 0) System.out.println("Введенное вами число делится на 3");
        else System.out.println("Введенное вами число не делится на 3");
    }
}