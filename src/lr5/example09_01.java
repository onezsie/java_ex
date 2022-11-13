package lr5;

class Field {
    private char chr;
    void setValue(char chr) {
        this.chr = chr;
    }
    public int getCode() {
        return chr;
    }
    void sout(){
        System.out.println("Символ: " + chr + ", код символа: " + getCode());
    }
}

public class example09_01 {
    public static void main(String[] args) {
        Field ob = new Field();
        ob.setValue('Q');
        ob.sout();
    }
}
