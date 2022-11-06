package lr4;
import java.util.Scanner;

public class example09_08 {
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
            char[] arrayChar = encryptString.toCharArray(); //преобразуем строку в массив символов
            long[] arrayLong = new long[arrayChar.length]; //
            char[] newArrayChar = new char[arrayChar.length];
            for (int i = 0; i < arrayChar.length; i++) {
                arrayLong[i] = arrayChar[i] + shift;
                newArrayChar[i] = (char) arrayLong[i];
            }
            encryptString = new String(newArrayChar);
            return encryptString;
        }

        static String getDecipher (String decipherString, int shift) {
            char[] arrayChar = decipherString.toCharArray(); //преобразуем строку в массив символов
            long[] arrayLong = new long[arrayChar.length];
            char[] newArrayChar = new char[arrayChar.length];
            for (int i = 0; i < arrayChar.length; i++) {
                arrayLong[i] = arrayChar[i] - shift;
                newArrayChar[i] = (char) arrayLong[i];
            }
            decipherString = new String(newArrayChar);
            return decipherString;
        }
}
