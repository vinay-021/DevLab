package Package_03.inheritance;

public class InheritanceDemo {
    static void main(String[] args) {
        Car c1 = new Car("Toyota",200,5);
        c1.displayInfo();

        Bike b1=new Bike("BMW",120,true);
        b1.displayInfo();
    }
}
