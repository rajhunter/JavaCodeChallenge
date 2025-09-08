
import java.util.*;

public class SortingToHashMapObject {

    public static void main(String[] Args){

        Map<String, Integer> emp = new HashMap<>();
        emp.put("Alice", 30);
        emp.put("Bob", 25);
        emp.put("Charlie", 35);

        // Sort by value
        List<Map.Entry<String, Integer>> sortedList = emp.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())   // ascending order
                .toList();

        System.out.println(sortedList);
    }
    }

