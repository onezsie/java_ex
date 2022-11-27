package lr7;

class Lab72{
    private String str;

    Lab72(String str) {
        this.str = str;
    }

    int StringLength() {
        return str.length();
    }

    void SetValue() {
        str = "";
    }

    void SetValue(String str) {
        this.str = str;
    }

    String ShowValue() {
        return str;
    }
}

class Lab72_v2 extends Lab72 {
    public int num;

    Lab72_v2(String str, int num) {
        super(str);
        this.num = num;
    }
    int StringLength() {
        return super.StringLength();
    }

    void setValue() {
        super.SetValue();
    }
    void setValue(String str) {
        super.SetValue(str);
    }
    void setValue(int num) {
        this.num = num;
    }
    void setValue(String str, int num) {
        super.SetValue(str);
        this.num = num;
    }
    void showValue() {
        System.out.println(num + " " + super.ShowValue());
    }
}

public class example09_02 {
    public static void main(String[] args) {
        Lab72 ob = new Lab72("Hello");
        System.out.println(ob.StringLength());

        Lab72_v2 ob2 = new Lab72_v2("Hey", 10);
        ob2.setValue("Banana");
        ob2.showValue();
    }
}
