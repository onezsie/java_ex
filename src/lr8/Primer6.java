package lr8;
import java.io.*;

public class Primer6 {
    public static void main(String[] args) throws IOException {
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("/Users/dmitryz/Desktop/firstFile.txt");
            out= new FileWriter("/Users/dmitryz/Desktop/secondFile.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }
}
