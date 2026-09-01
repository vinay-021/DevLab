package Package_01;

public class Variables {
    static void main(String[] args) {
        //Declaration
        int a;
        String name;

        //Initialization
        a = 10;
        name = "Java";

        int age = 20;

        System.out.printf("Hello %s. You are %d years old.%n", name, age);

        // Your name, your age, your favourite programming language
        name = "Vinay";
        age = 23;
        String fav = "Java";
        System.out.println("Hy! I'm " + name + ". I'm " + age + " years old & my favourite programming language is " + fav + ".");

        //CONSTANTS
        final int CONSTANT_VALUE = 3;
        /* final keyword makes a variable constant(i.e., we cannot modify its value in the future code).
        keywords are the words which have their own pre-defined meaning & character in a programming language.
        You cannot assign a value to a keywords as they are already reserved in a programming language. */
    }
}
