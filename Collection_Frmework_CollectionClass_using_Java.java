import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Frmework_CollectionClass_using_Java {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(65);
        list.add(49);
        list.add(9);
        list.add(21);
        list.add(5);
        list.add(9);
        System.out.println("Print List : " + list);
        System.out.println("Minimun Element in List : " + Collections.min(list)); // Find Minimum in List
        System.out.println("Maximun Element in List : " + Collections.max(list)); // Find Maximum in List
        System.out.println("Frequency of 5 in List : " + Collections.frequency(list, 5)); // Find how many time Element
                                                                                          // present in List
        System.out.println("Frequency of 9 in List : " + Collections.frequency(list, 9));

        // Sort Collections
        System.out.println("Before Sorting : " + list);
        Collections.sort(list); // Sorting
        System.out.println("After Sorting : " + list);

        // Sort in Reverse
        System.out.println("Before Sorting : " + list);
        Collections.sort(list, Comparator.reverseOrder()); // Sorting Reverse order
        System.out.println("After Sorting : " + list);
    }
}
