package Package_05;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
//        int a=10;
//        int result=10/0;
//        System.out.println(result+" Done");

        try{
            //EXCEPTION GENERATING STATEMENTS
            int result=10/0;
        }catch(ArithmeticException e){
            System.out.println("In Catch Block");
        }
        System.out.println("Done");

        int[] a={1,2,3};
        try{
            System.out.println(a[2]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception");
        }catch(ArithmeticException e){

        }finally {
            //Always Executes
            System.out.println("Finally");
        }
        System.out.println("Outside the Catch Block");

        try {
            FileReader fileReader=new FileReader("a.txt");
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
