package lr5;

class LabThree {
    int firstInt;
    int secondInt;

    LabThree(){
        firstInt = 1;
        secondInt = 1;
    }
    LabThree(int firstInt) {
        this.firstInt = firstInt;
    }
    LabThree(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

}

public class example09_03 {
    public static void main(String[] args) {
        LabThree ob = new LabThree();
        LabThree ob1 = new LabThree(5);
        LabThree ob2 = new LabThree(10, 20);
        System.out.println(ob.firstInt);
        System.out.println(ob1.firstInt);
        System.out.println(ob2.firstInt);
    }
}
