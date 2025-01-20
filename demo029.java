import java.util.ArrayList;

public class demo029 {
    public static void main(String[] args) {
        
        ArrayList<String> friendsList = new ArrayList<>();

        friendsList.add("Alice");
        friendsList.add("Bob");
        friendsList.add("Charlie");
        friendsList.add("Diana");
        friendsList.add("Edward");
        friendsList.add("Fiona");
        friendsList.add("George");
        friendsList.add("Hannah");
        friendsList.add("Ivan");
        friendsList.add("Julia");

        System.out.println("Friends List:");
        for (String friend : friendsList) {
            System.out.println(friend);
        }
    }
}
