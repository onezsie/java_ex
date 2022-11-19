package lr6;

class Lab61{
    String str;
    char symbol;

    void setValue(char symbol) {
        this.symbol = symbol;
    }
    void setValue(String str) {
        this.str = str;
    }
    void setValue(char[] charArray){
        if (charArray.length < 2) {
            symbol = charArray[0];
        }
        else str = new String(charArray);
    }
}


public class example09_01 {
    public static void main(String[] args) {
        Lab61 ob = new Lab61();
        Lab61 ob2 = new Lab61();
        ob.setValue('b');
        System.out.println(ob.symbol);
        ob.setValue("Hello!");
        System.out.println(ob.str);
        ob2.setValue(new char[]{'a', 'l', 'o', 'n', 'e'});
        ob2.setValue(new char[]{'Q'});
        System.out.println(ob2.str);
        System.out.println(ob2.symbol);
    }
}
