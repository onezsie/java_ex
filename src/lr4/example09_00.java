package lr4;
import java.lang.String;

class Box {
    double width;
    double height;
    double depth;

    double volume (){
        return width * height * depth;
    }
}
public class example09_00 {
    public static void main(String[] args) {
    Box myBox = new Box();
    Box myBox2 = new Box();
    myBox.width = 10;
    myBox.height = 10;
    myBox.depth = 5;
    myBox2 = myBox;
    System.out.println(myBox2.width);
    System.out.println(myBox.width);
    myBox2.width = 99;
    System.out.println(myBox2.width);
    System.out.println(myBox.width);
    }
}
