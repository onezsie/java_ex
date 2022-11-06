package lr4;
import java.lang.String;

public class example09_00 {
    public static void main(String[] args) {
        String shifr = "ABCDEFGHIGKLMNOPQRSTQVWXUZАБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЫЬЭЮЯ1234567890";
        char[] arr = shifr.toCharArray();
        for (char x : arr)System.out.print(x + " ");
        System.out.println(arr.length);
        int a = shifr.indexOf("И");
        System.out.println(a);
    }
}
