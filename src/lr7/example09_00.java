package lr7;

class Box{
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        depth = -1;
        height = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight {
    double cost;

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    Shipment(Shipment ob, double c) {
        super(ob);
        cost = c;
    }
}

public class example09_00 {
    public static void main(String[] args) {
        Box box = new Box(5, 3, 10);

    }
}

