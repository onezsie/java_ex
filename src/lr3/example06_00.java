package lr3;

public class example06_00 {
    public static void main(String[] args) {
        double a = 5.456;
        int b = -6;
        int c = 18;
        int d = -36;
        System.out.println(b | c);
        System.out.println(b << 1);
        System.out.println(b << 2);
        System.out.println(b << 3);
        System.out.println(d >> 1);
        System.out.println(d >> 2);
        System.out.println(d >> 3);
        int fu = 0xf1;
        System.out.println(fu);
        int[] x = new int[10];
        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
        }
        int denom = 18;
        int ratio;
        ratio = denom == 0 ? 0 : c*7 / denom;
        System.out.println(ratio);
    }
}