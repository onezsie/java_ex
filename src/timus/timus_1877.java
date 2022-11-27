package timus;
import java.util.Scanner;

public class timus_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        if (first % 2 == 0 || second % 2 != 0) System.out.println("yes");
        else System.out.println("no");
    }
}
// DONE
