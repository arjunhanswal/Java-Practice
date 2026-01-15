
// Hash map and entry set example
import java.util.*;

public class EntrySetExample {
    public static void main (String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}