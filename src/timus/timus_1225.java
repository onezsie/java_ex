package timus;
import java.util.Scanner;

public class timus_1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 2) System.out.println ((n - 2) * 2 + 2);
        else System.out.println(2);
    }
}
// NOT DONE