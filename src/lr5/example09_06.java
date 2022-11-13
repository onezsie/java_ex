package lr5;

class LabSix {
    private int min;
    private int max;

    LabSix(int firstValue) {
        max = Math.max(max, firstValue);
        min = Math.min(min, firstValue);
    }
    LabSix(int firstValue, int secondValue) {
        max = Math.max(Math.max(firstValue, secondValue), max);
        min = Math.min(Math.min(firstValue, secondValue), min);
    }

    void setValue(int firstValue) {
        max = Math.max(max, firstValue);
        min = Math.min(min, firstValue);
    }
    void setValue(int firstValue, int secondValue) {
        max = Math.max(Math.max(firstValue, secondValue), max);
        min = Math.min(Math.min(firstValue, secondValue), min);
    }

    void showValue() {
        System.out.println("Максимальное значение: " + max + ", минимальное значение: " + min);
    }
}

public class example09_06 {
    public static void main(String[] args) {
        LabSix ob = new LabSix(3);
        LabSix ob2 = new LabSix(8, 16);
        ob2.setValue(45, -15);
        ob.setValue(14, -5);
        ob.showValue();
        ob2.showValue();
    }
}
