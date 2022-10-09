package lr3;
import java.util.Scanner;
public class example06_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int num = in.nextInt();
        switch (num) {
            case 1 -> System.out.printf("Числу %d соответствует Понедельник \n", num);
            case 2 -> System.out.printf("Числу %d соответствует Вторник \n", num);
            case 3 -> System.out.printf("Числу %d соответствует Среда \n", num);
            case 4 -> System.out.printf("Числу %d соответствует Четверг \n", num);
            case 5 -> System.out.printf("Числу %d соответствует Пятница \n", num);
            case 6 -> System.out.printf("Числу %d соответствует Суббота \n", num);
            case 7 -> System.out.printf("Числу %d соответствует Воскресенье \n", num);
            default -> System.out.println("Введено некорректное значение");
        }
    }
}

