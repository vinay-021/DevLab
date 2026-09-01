package Package_04;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");
        roles.add("MANAGER"); //Sets ignore duplicates

        for (String role : roles) {
            System.out.println("ROLES : " + role);
        }
    }
}
