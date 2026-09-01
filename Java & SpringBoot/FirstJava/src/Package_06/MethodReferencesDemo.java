package Package_06;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {
    static void main(String[] args) {
        //::
        //1 using for loop
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //using enhance for loop
        for (String name : names) {
            System.out.println(name);
        }

        /*names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });*/


        /*names.forEach((String name)->{
                System.out.println(name);
        });*/

        /*names.forEach((name)->{
            System.out.println(name);
        });*/

//        names.forEach((name)->System.out.println(name));

        names.forEach(System.out::println);

    }
}
