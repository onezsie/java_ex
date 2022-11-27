package timus;
import java.util.Scanner;

public class timus_1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int mid = 0;
        int max = 0;
        int num;
        for (int j = 1; j < arr.length-1; j++){
            num = arr[j-1] + arr[j] + arr[j+1];
            if (num > max) {
                max = num;
                mid = j + 1;
            }
        }
        System.out.println(max + " " + mid);
    }
}
// DONE

