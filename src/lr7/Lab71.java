package lr7;

public class Lab71 {
    private String str;

    public Lab71(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        String superString;
        superString = "super" + "\n" + " Class name: " + this.getClass().getSimpleName() + "\n" + " str = " + this.getStr();
        return superString;
    }

    String getStr() {
        return str;
    }
}
