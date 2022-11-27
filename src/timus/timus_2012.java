package timus;
import java.util.Scanner;

public class timus_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 12 - in.nextInt();
        int allTime = 60 * 4;
        while (allTime >= 45 && num > 0) {
            num--;
            allTime -= 45;
        }
        if (num == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
// DONE
