import java.util.Scanner;
public class example06_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        System.out.println("Во введенном вами числе " + num / 1000 + " тысяч");
    }
}
