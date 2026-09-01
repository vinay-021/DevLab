package Package_03.inheritance;

public class Bike extends Vehicle{
    private boolean hasCarrier;
    public Bike(String brand, int speed,boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier=hasCarrier;
    }

    @Override
    public void displayInfo() {
         super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + "km/h, hasCarrier: "+hasCarrier);
    }
}
