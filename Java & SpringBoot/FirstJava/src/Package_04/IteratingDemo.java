package Package_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("John");

//    List<User> userList=getFromDatabase();

        //For each
        System.out.println("Using For-each");
        for (String user:users){
            System.out.println(user);
        }

        //For loop
        System.out.println("Using For loop");
        for (int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }

        //Iterator
        System.out.println("Using Iterator");
        Iterator<String> it=users.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            if (it.next().equals("Bob")){
                it.remove();
            }
        }
        for (String user:users){
            System.out.println(user);
        }

    }
}
