package Package_03.constructors;

record Bike(String brand, int speed) {
}

public class RecordDemo {
    static void main() {
        Bike bike = new Bike("BMW", 220);
        System.out.println("Brand: " + bike.brand());
        System.out.println("Speed: " + bike.speed());
        System.out.println(bike);
    }
}
