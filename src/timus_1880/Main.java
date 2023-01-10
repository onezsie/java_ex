package timus_1880;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));
        int sizeOne = Integer.parseInt(bufferedReader.readLine());
        String[] stringsOne = bufferedReader.readLine().split(" ");
        int sizeTwo = Integer.parseInt(bufferedReader.readLine());
        String[] stringsTwo = bufferedReader.readLine().split(" ");
        int sizeThree = Integer.parseInt(bufferedReader.readLine());
        String[] stringsThree = bufferedReader.readLine().split(" ");

        int allSize = sizeOne + sizeThree + sizeTwo;
        String[] strings = new String[allSize];

        for (int i = 0, x = 0, y = 0; i < allSize; i++) {
            if (i < sizeOne) {
                strings[i] = stringsOne[i];
            } else if (i < sizeOne + sizeTwo) {
                strings[i] = stringsTwo[x];
                x++;
            }
            else {
                strings[i] = stringsThree[y];
                y++;
            }
        }
        Arrays.sort(strings);
        int count = 0;
        for (int i = 1; i < strings.length - 1; i++) {
            if (strings[i].equals(strings[i-1]) && strings[i].equals(strings[i+1])) {
                count++;
            }
        }
        System.out.println(count);

    }
}

// DONE