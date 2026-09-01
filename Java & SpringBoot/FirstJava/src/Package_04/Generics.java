package Package_04;

import java.util.ArrayList;
import java.util.List;

class CarNew {
    String brand;

    CarNew(String brand) {
        this.brand = brand;
    }
}

public class Generics {
    static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
//      users.add(1);
        users.add("Alice");

        System.out.println("All Users");
        for (Object user : users) {
            System.out.println(user);
        }

        System.out.println("Elements using index: " + users.get(0));

        //List of Objects
        CarNew carNew1 = new CarNew("Toyota");
        CarNew carNew2 = new CarNew("Ford");

        List<CarNew> carNewList = new ArrayList<>();
        carNewList.add(carNew1);
        carNewList.add(carNew2);

        System.out.println("All Cars");
        for (CarNew carNew : carNewList) {
            System.out.println(carNew.brand);
        }

    }
}
