import java.util.*;

public class objectExample {
    public static void main(String[] args) {
        // Create a list and add elements
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Create a set and add elements
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Create a map and add key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Print elements of the list
        System.out.println("List: " + list);

        // Print elements of the set
        System.out.println("Set: " + set);

        // Print key-value pairs of the map
        System.out.println("Map: " + map);
    }
}
