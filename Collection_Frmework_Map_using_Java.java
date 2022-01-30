import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Collection_Frmework_Map_using_Java {
    public static void main(String[] args) {
        //// Hash Map
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Three", 3);
        mp.put("Nine", 9);
        mp.put("Five", 5);
        // mp.put("Nine", 54); // It will over-ride
        System.out.println("Print Map = " + mp);// Print Map
        mp.putIfAbsent("Nine", 42); // It will not put beacuse Key='Nine' is already present in map.
        mp.putIfAbsent("Six", 6); // It will put beacuse Key='Six' is not present in map.
        System.out.println("After puting Print Map = " + mp);
        System.out.println("If Value Present = " + mp.containsValue(9)); // Contains Value in map
        System.out.println("If Key Present = " + mp.containsKey("One")); // Contains Key in map
        System.out.println("Is Empty = " + mp.isEmpty()); // Check Map Empty or Not

        for (Map.Entry<String, Integer> e_set : mp.entrySet()) { // Print all Value and Key present in Map
            System.out.println();
            System.out.println(e_set);

            System.out.println("Key : " + e_set.getKey());
            System.out.println("Value : " + e_set.getValue());
        }
        System.out.println();

        for (String k : mp.keySet()) { // Print all Key present in Map
            System.out.println("Key : " + k);
        }
        System.out.println();

        for (String v : mp.keySet()) { // Print all Value present in Map
            System.out.println("Value : " + v);
        }
        System.out.println();

        // Only print Key
        System.out.println("Only Key Persent in Map = " + mp.keySet());

        // Only print Value
        System.out.println("Only Value Persent in Map = " + mp.values());

        System.out.println("Print Before Remove = " + mp);
        System.out.println("Remove Key : " + mp.remove("Nine")); // Key wise Removing
        System.out.println("Print After Remove = " + mp);

        System.out.println("Size Before Delete = " + mp.size());
        System.out.println("Is Empty = " + mp.isEmpty());
        mp.clear(); // Delete all Element from Map
        System.out.println("Size After Delete = " + mp.size());
        System.out.println("Is Empty = " + mp.isEmpty());

        //// Tree Map
        Map<String, Integer> tmp = new TreeMap<>();
        tmp.put("Three", 3);
        tmp.put("Nine", 9);
        tmp.put("Arif", 56);
        tmp.put("Five", 5);
        // mp.put("Nine", 54); // It will over-ride
        System.out.println("Print Map = " + tmp);// Print Map Sort form Key wise Dictonary order
        tmp.putIfAbsent("Nine", 42); // It will not put beacuse Key='Nine' is already present in map.
        tmp.putIfAbsent("Six", 6); // It will put beacuse Key='Six' is not present in map.
        System.out.println("After puting Print Map = " + tmp);
        System.out.println("If Value Present = " + tmp.containsValue(9)); // Contains Value in map
        System.out.println("If Key Present = " + tmp.containsKey("One")); // Contains Key in map
        System.out.println("Is Empty = " + tmp.isEmpty()); // Check Map Empty or Not

        for (Map.Entry<String, Integer> e_set : tmp.entrySet()) { // Print all Value and Key present in Map
            System.out.println();
            System.out.println(e_set);

            System.out.println("Key : " + e_set.getKey());
            System.out.println("Value : " + e_set.getValue());
        }
        System.out.println();

        for (String k : tmp.keySet()) { // Print all Key present in Map
            System.out.println("Key : " + k);
        }
        System.out.println();

        for (String v : tmp.keySet()) { // Print all Value present in Map
            System.out.println("Value : " + v);
        }
        System.out.println();

        // Only print Key
        System.out.println("Only Key Persent in Map = " + tmp.keySet());

        // Only print Value
        System.out.println("Only Value Persent in Map = " + tmp.values());

        System.out.println("Print Before Remove = " + tmp);
        System.out.println("Remove Key : " + tmp.remove("Nine")); // Key wise Removing
        System.out.println("Print After Remove = " + tmp);

        System.out.println("Size Before Delete = " + tmp.size());
        System.out.println("Is Empty = " + tmp.isEmpty());
        tmp.clear(); // Delete all Element from Map
        System.out.println("Size After Delete = " + tmp.size());
        System.out.println("Is Empty = " + tmp.isEmpty());
    }
}
