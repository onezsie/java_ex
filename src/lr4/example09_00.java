package lr4;


public class example09_00 {
    public static void main(String[] args) {
        int figure = 10;
        int i, j ,z;
        for (i =0;i < figure; i++) {
            System.out.print("nomer stroki:  " + i + " ");
            z = 0;
            for (j= - 5; j < figure; j++){
                System.out.print("+");
                z+=1;
            }
            System.out.println(" sim v stroke: " + z);
        }
    }
}
