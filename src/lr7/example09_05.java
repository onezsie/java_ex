package lr7;


class ClassOne {
    private String str;
    ClassOne(String str) {
        this.str = str;
    }
    void ShowInfo() {
        System.out.print("Название класса: " + this.getClass().getSimpleName() + ", значение поля str: " + str);
    }
}

class ClassTwo extends ClassOne {
    private int num;
    ClassTwo(String str, int num) {
        super(str);
        this.num = num;
    }
    @Override
    void ShowInfo() {
        super.ShowInfo();
        System.out.print(", значение поля num: " + num);
    }
}

class ClassThree extends ClassOne {
    private char symbol;
    ClassThree(String str, char symbol) {
        super(str);
        this.symbol = symbol;
    }
    @Override
    void ShowInfo() {
        super.ShowInfo();
        System.out.print(", значение поля symbol: " + symbol);
    }
}


public class example09_05 {
    public static void main(String[] args) {
        ClassOne ob = new ClassOne("Pill");
        ob.ShowInfo();
        ClassTwo obj = new ClassTwo("Silent", 2);
        System.out.println();
        obj.ShowInfo();
        ClassThree obj2 = new ClassThree("One", 'T');
        System.out.println();
        obj2.ShowInfo();
        ClassOne object3 = obj2;
        System.out.println();
        object3.ShowInfo();
    }
}
