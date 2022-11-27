package timus;
import java.util.Scanner;

public class timus_1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int kP = k + 1;
        int kM = k - 1;
        int firstP = kP / 1000;
        int secondP = kP % 1000;
        int firstM = kM / 1000;
        int secondM = kM % 1000;
        int firstPResult = firstP % 10 + firstP / 100 + (firstP / 10 % 10);
        int secondPResult = secondP % 10 + secondP / 100 + (secondP / 10 % 10);
        int firstMResult = firstM % 10 + firstM / 100 + (firstM / 10 % 10);
        int secondMResult = secondM % 10 + secondM / 100 + (secondM / 10 % 10);
        if (Math.abs(firstPResult-secondPResult) == 0 || Math.abs(firstMResult - secondMResult) == 0) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
// DONE