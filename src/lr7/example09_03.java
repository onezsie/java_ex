package lr7;

class First {
   public int num;

   void setValue(int num) {
       this.num = num;
   }
   First(int num) {
       this.num = num;
   }
   public String toString() {
       String superString;
       superString = "Название класса: " + this.getClass().getSimpleName() + ", значение поля num: " + num;
       return superString;
   }
}
class Second extends First {
    public char symbol;

    Second(int num, char symbol) {
        super(num);
        this.symbol = symbol;
    }

    void setValue(int num, char symbol) {
        super.setValue(num);
        this.symbol = symbol;
    }
    public String toString() {
        String subChar;
        subChar = "Название класса: " + this.getClass().getSimpleName() +
                ", значение поля num: " + num + ", значение поля symbol: " + symbol;
        return subChar;
    }
}

class Third extends Second {
    public String str;

    Third(int num, char symbol, String str) {
        super(num, symbol);
        this.str = str;
    }
    void setValue(int num, char symbol, String str) {
        super.setValue(num, symbol);
        this.str = str;
    }
    public String toString() {
        String subChar;
        subChar = "Название класса: " + this.getClass().getSimpleName() + ", значение поля num: " + num +
                ", значение поля symbol: " + symbol + ", значение поля str: " + str;
        return subChar;
    }
}

public class example09_03 {
    public static void main(String[] args) {
        First ob = new First(10);
        ob.setValue(25);
        Second ob2 = new Second(100, 'A');
        ob2.setValue(250);
        Third ob3 = new Third(1000, 'B',"JavaScript");
        ob3.setValue(2500, 'C', "Java");
        System.out.println(ob.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
    }
}
