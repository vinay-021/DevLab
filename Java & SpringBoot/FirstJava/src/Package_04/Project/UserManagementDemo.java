package Package_04.Project;

import java.util.*;

public class UserManagementDemo {
    static void main(String[] args) {
//        Set<String> user1Roles=new HashSet<>(Arrays.asList("Admin","User"));
//        User user1=new User("Alice",true,user1Roles);
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", true, new HashSet<>(Arrays.asList("Admin", "User"))));
        users.add(new User("Bob", false, new HashSet<>(List.of("User"))));
        users.add(new User("Charlie", true, new HashSet<>(List.of("Manager"))));

        //Removing Inactive Users
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive()) {
                iterator.remove();
            }
        }

        // Print Active Users
        System.out.println("Active Users:");
        for (User user : users) {
            System.out.println(user.getName());
        }

//Count Users Per Role
        Map<String, Integer> roleCount = new HashMap<>();
        //        roleCount.get("gsagsag", 0);
        // ADMIN: 1
        // USER: 1
        for (User user : users) {
            for (String role : user.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("All Roles: Count");
        for (Map.Entry<String, Integer> entry : roleCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
