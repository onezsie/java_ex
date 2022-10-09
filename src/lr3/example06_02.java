package lr3;
import java.util.Scanner;

public class example06_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String str = in.nextLine();
        System.out.println("Реализация на основе Switch: ");
        switch (str) {
            case "Понедельник", "понедельник" -> System.out.println("Понедельнику соответствует порядковый номер: 1");
            case "Вторник", "вторник" -> System.out.println("Вторнику соответствует порядковый номер: 2");
            case "Среда", "среда" -> System.out.println("Среде соответствует порядковый номер: 3");
            case "Четверг", "четверг" -> System.out.println("Четвергу соответствует порядковый номер: 4");
            case "Пятница", "пятница" -> System.out.println("Пятнице соответствует порядковый номер: 5");
            case "Суббота", "суббота" -> System.out.println("Субботе соответствует порядковый номер: 6");
            case "Воскресенье", "воскресенье" -> System.out.println("Воскресенью соответствует порядковый номер: 7");
            default -> System.out.println("Введен некорректный день недели.");
        }
        System.out.println("Реализация на основе If: ");
        if (str.equals("Понедельник") || str.equals("понедельник")) System.out.println("Понедельнику соответствует порядковый номер: 1");
        else if (str.equalsIgnoreCase("Вторник")) System.out.println("Вторнику соответствует порядковый номер: 2");
        else if (str.equalsIgnoreCase("Среда")) System.out.println("Среде соответствует порядковый номер: 3");
        else if (str.equalsIgnoreCase("Четверг")) System.out.println("Четвергу соответствует порядковый номер: 4");
        else if (str.equalsIgnoreCase("Пятница")) System.out.println("Пятнице соответствует порядковый номер: 5");
        else if (str.equalsIgnoreCase("Суббота")) System.out.println("Субботе соответствует порядковый номер: 6");
        else if (str.equalsIgnoreCase("Воскресенье")) System.out.println("Воскресенью соответствует порядковый номер: 7");
        else System.out.println("Введен некорректный день недели.");
    }
}
