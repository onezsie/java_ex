package lr5;

class LabFour {
    int intField;
    char charField;

    LabFour(int intField, char charField) {
        this.intField = intField;
        this.charField = charField;
    }
    LabFour(double dub) {
        charField = (char)((int) dub);
        intField = (int)(dub * 100) % 100;
    }
}

public class example09_04 {
    public static void main(String[] args) {
        LabFour ob = new LabFour(80.4435);
        System.out.println(ob.charField);
        System.out.println(ob.intField);
    }
}
