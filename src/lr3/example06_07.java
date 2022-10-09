package lr3;

public class example06_07 {
    public static void main(String[] args) {
        int arsLength = 10;
        char[] ars = new char[arsLength];
        char firstChar = 'a';
        for (int i = 0; i < arsLength; i++) { // Заполняем массив символами
            ars[i] = firstChar;
            firstChar += 2;
        }
        System.out.println("Вывод массива по порядку: ");
        for (char x : ars) System.out.print(x + " ");
        System.out.println("\nВывод массива в обратном порядке: ");
        for(int i = arsLength - 1; i >=0; i--) System.out.print(ars[i] + " ");
    }
}
