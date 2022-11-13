package lr5;

class LabTwo {
    public char firstChar;
    char secChar;

    void soutValue() {
        for (char i = firstChar; i <= secChar; i++) {
            System.out.print(i + " ");
        }
    }
}

public class example09_02 {
    public static void main(String[] args) {
        LabTwo ob = new LabTwo();
        ob.firstChar = 'B';
        ob.secChar = 'Q';
        ob.soutValue();
    }
}
