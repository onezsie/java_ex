package lr7;

class Lab71_v2 extends Lab71 {
    private String str2;
    Lab71_v2(String str) {
        super(str);
    }
    Lab71_v2(String str, String str2) {
        super(str);
        this.str2 = str2;
    }
    @Override
    public String toString() {
        String superString;
        superString = "super" + "\n" + " Class name: " + this.getClass().getSimpleName()
                + "\n" + " str = " + super.getStr() + " str2 = " + this.str2;
        return superString;
    }
    String getStr() {
        return str2;
    }
}

public class example09_01 {
    public static void main(String[] args) {
        Lab71 ob = new Lab71("Hello");
        String result = ob.toString();
        System.out.println(result);
        Lab71_v2 object = new Lab71_v2("Hey", "Friend");
        String result2 = object.toString();
        System.out.println(result2);
    }
}


