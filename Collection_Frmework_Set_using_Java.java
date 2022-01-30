import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Frmework_Set_using_Java {
    public static void main(String[] args) {
        ///// HashSet
        Set<Integer> Hset = new HashSet<>();
        Hset.add(93);
        Hset.add(32);
        Hset.add(51);
        Hset.add(68);
        Hset.add(34);
        Hset.add(34); // It will not added in Hashset, because 34 is already present in Hashset.
        System.out.println("Print Set = " + Hset); // Print Randomly
        Hset.remove(68); // Remove Element from Set
        System.out.println("After remove = " + Hset);
        System.out.println("If Present in Set = " + Hset.contains(34)); // Present Element or not
        System.out.println("Is Empty = " + Hset.isEmpty());
        System.out.println("Size of Set = " + Hset.size());
        Hset.clear();
        System.out.println("Print Set After Delete all element = " + Hset);
        System.out.println("Size of Set = " + Hset.size());

        ///// LinkedHashSet
        Set<Integer> Lset = new LinkedHashSet<>();
        Lset.add(93);
        Lset.add(32);
        Lset.add(51);
        Lset.add(68);
        Lset.add(34);
        Lset.add(34); // It will igenor
        System.out.println("\nPrint Set = " + Lset); // Insert wise Element print
        Lset.remove(68); // Remove Element from Set
        System.out.println("After remove = " + Lset);
        System.out.println("If Present in Set = " + Lset.contains(34)); // Present Element or not
        System.out.println("Is Empty = " + Lset.isEmpty());
        System.out.println("Size of Set = " + Lset.size());
        Lset.clear();
        System.out.println("Print Set After Delete all element = " + Lset);
        System.out.println("Size of Set = " + Lset.size());

        ///// TreeSet
        Set<Integer> Tset = new TreeSet<>();
        Tset.add(93);
        Tset.add(32);
        Tset.add(51);
        Tset.add(68);
        Tset.add(34);
        Tset.add(34); // It will igenor
        System.out.println("\nPrint Tree Set = " + Tset); // Print Element with Sortest form
        Tset.remove(68); // Remove Element from Set
        System.out.println("After remove = " + Tset);
        System.out.println("If Present in Set = " + Tset.contains(34)); // Present Element or not
        System.out.println("Is Empty = " + Tset.isEmpty());
        System.out.println("Size of Set = " + Tset.size());
        Tset.clear();
        System.out.println("Print Set After Delete all element = " + Tset);
        System.out.println("Size of Set = " + Tset.size());
    }
}
