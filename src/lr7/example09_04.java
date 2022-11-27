package lr7;

class FirstClass {
    public char symbol;
    FirstClass(char symbol) {
        this.symbol = symbol;
    }
    FirstClass(FirstClass ob) {
        symbol = ob.symbol;
    }
}
class SecondClass extends FirstClass {
    public String str;
    SecondClass(char symbol, String str) {
        super(symbol);
        this.str = str;
    }
    SecondClass(SecondClass ob) {
        super(ob);
        str = ob.str;
    }
}

class ThirdClass extends SecondClass {
    public int num;
    ThirdClass(char symbol, String str, int num) {
        super(symbol, str);
        this.num = num;
    }
    ThirdClass(ThirdClass ob) {
        super(ob);
        num = ob.num;
    }
}

public class example09_04 {
    public static void main(String[] args) {
        ThirdClass obj = new ThirdClass('A', "Hello", 15);
        ThirdClass objCopy = new ThirdClass(obj);
        SecondClass objSec = new SecondClass(obj);
        System.out.println(objSec.str);
    }
}
