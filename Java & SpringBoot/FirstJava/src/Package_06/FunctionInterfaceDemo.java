package Package_06;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static Function<Integer, Integer> addFunction = (a) -> a + 3;

    static void main(String[] args) {
        System.out.println(addFunction.apply(10));
    }
}
