package lr4;
import java.util.Scanner;
import java.lang.String;

public class example09_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку для шифрования: ");
        String myStr = in.nextLine(); // изначальная строка
        System.out.print("Введите ключ: ");
        int shift = in.nextInt(); // На какое количество символов сдвигаем

        String result = getEncrypt(myStr, shift); // Строка после преобразования
        System.out.println("Строка после преобразования: " + result);
        System.out.print("Выполнить обратное преобразование? (y/n) ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine(); // ответ пользователя
        boolean flag = true;
        while(flag) {
            switch (answer) {
                case "y" -> {
                    result = getDecipher(result, shift);
                    System.out.println("Строка после расшифровки: " + result);
                    flag = false;
                }
                case "n" -> {
                    System.out.println("До свидания! ");
                    flag = false;
                }
                default -> {
                    System.out.print("Введите корректный ответ (y/n) ");
                    answer = scanner.nextLine();
                }
            }
        }
    }
    static String getEncrypt(String encryptString, int shift) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЫЬЭЮЯ1234567890";
        char[] arrAlph = alph.toCharArray();
        char[] arrayChar = encryptString.toCharArray(); //преобразуем строку в массив символов
        char[] newArrayChar = new char[arrayChar.length];
        int index;
        for (int i = 0; i < arrayChar.length; i++) {
            index = alph.indexOf(arrayChar[i]);
            newArrayChar[i] = arrAlph[(index + shift) % arrAlph.length];
        }
        encryptString = new String(newArrayChar);
        return encryptString;
    }

    static String getDecipher (String decipherString, int shift) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЫЬЭЮЯ1234567890";
        char[] arrAlph = alph.toCharArray();
        char[] arrayChar = decipherString.toCharArray(); //преобразуем строку в массив символов
        char[] newArrayChar = new char[arrayChar.length];
        int index;
        for (int i = 0; i < arrayChar.length; i++) {
            index = alph.indexOf(arrayChar[i]);
            if (index - shift < 0) {
                newArrayChar[i] = arrAlph[(index - shift) + (arrAlph.length * (int)Math.ceil((double)Math.abs(index - shift) / arrAlph.length))];
            }
            else newArrayChar[i] = arrAlph[(index - shift)];
        }
        decipherString = new String(newArrayChar);
        return decipherString;
    }
}
