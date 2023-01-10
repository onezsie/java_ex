package lr8;
import java.io.*;

public class example09_01 {
    public static void main(String[] args) {
        try{
            File firstFile = new File("TestFile1.txt");
            firstFile.createNewFile();
            if (firstFile.exists()){
                System.out.println("Операция прошла успешно");
                System.out.println("Полный путь к файлу номер 1: " + firstFile.getAbsolutePath());
            }

            File secondFile = new File("C:\\TestFile2.txt");
            secondFile.createNewFile();
            System.out.println("Полный путь к файлу номер 2: "+secondFile.getAbsolutePath());
            File f3 = new File("C:\\Users\\lerak\\IdeaProjects\\JavaEducation\\src\\Lr8\\example11");
            f3.mkdirs();
            System.out.println("Полный путь к файлу №3: "+f3.getAbsolutePath());
        } catch (Exception mistake){
            System.out.println("Произошла ошибка. Причина: " + mistake);
        }
    }
}
