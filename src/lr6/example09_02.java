package lr6;

class Lab62 {
    private static int num = 0;

    static void showValue() {
        System.out.println("Текущее значение переменной: " + num);
        num++;
    }
}

public class example09_02 {
    public static void main(String[] args) {
        Lab62.showValue();
        Lab62.showValue();
        Lab62.showValue();
    }
}
