package lr5;

class LabFive {
    private int firstInt;

    void setValue(int firstInt) {
        this.firstInt = Math.min(firstInt, 100);
    }
    void setValue() {
        firstInt = 0;
    }
    LabFive() {
        firstInt = 0;
    }
    LabFive(int firstInt) {
        this.firstInt = Math.min(firstInt, 100);
    }
    void showValue() {
        System.out.println(firstInt);
    }
}


public class example09_05 {
    public static void main(String[] args) {
        LabFive ob = new LabFive(46);
        LabFive ob2 = new LabFive();
        ob.showValue();
        ob2.showValue();
        ob.setValue(985);
        ob2.setValue(74);
        ob.showValue();
        ob2.showValue();
    }
}
