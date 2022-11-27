package timus;
import java.util.Scanner;

public class timus_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int bif = n << 1;
        int counter = 0;
        if (n / k > 0) {
            while (bif > 0) {
                bif -= k;
                counter++;
            }
            System.out.println(counter);
        }
        else System.out.println(2);
    }
}
// DONE