package Package_03.polymorphism;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}

public class PolymorphismDemo {
    static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("BMW", 120, true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("VehicleBrand", 202);
        v1.start();

        Vehicle v2 = new Car("Ford", 210, 5);
        v2.start();

        Vehicle v3 = new Bike("Yamaha", 120, true);
        v3.start();

        //Method Overloading
        b1.start("Hello");

        Calculator calculator=new Calculator();
        System.out.println("Sum(int): "+calculator.add(5,6));
        System.out.println("Sum(float): "+calculator.add(5.6,6.7));
    }
}