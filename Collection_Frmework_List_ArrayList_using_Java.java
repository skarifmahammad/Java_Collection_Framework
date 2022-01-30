import java.util.ArrayList;
import java.util.List;

public class Collection_Frmework_List_ArrayList_using_Java {
    public static void main(String[] args) {
        List<Integer> ls1 = new ArrayList<>(); // Create List
        ls1.add(1);
        ls1.add(2);
        ls1.add(3);
        ls1.add(4);
        System.out.println("Before adding = " + ls1);
        ls1.add(7);
        ls1.add(9);
        System.out.println("After adding = " + ls1);
        ls1.add(2, 13); // Index wise insert
        System.out.println("After Index wise adding = " + ls1);

        List<Integer> ls2 = new ArrayList<>();
        ls2.add(33);
        ls2.add(44);
        ls2.add(55);
        System.out.println("New List = " + ls2);

        ls1.addAll(ls2);
        System.out.println("After copy = " + ls1); // Add list to another list

        ls1.set(3, 555);// Replace Index wise
        System.out.println("After Set value = " + ls1);

        System.out.println("Get Index wise Element = " + ls1.get(7)); // get Index wise element

        System.out.println(ls1.contains(9));// Search Element in list

        ////
        List<Integer> ls3 = new ArrayList<>();
        ls3.add(10);
        ls3.add(20);
        ls3.add(30);
        ls3.add(40);
        ls3.add(50);
        ls3.add(60);
        System.out.println("Before remove = " + ls3);

        ls3.remove(3); // Remove index wise
        System.out.println("After remove Index wise = " + ls3);

        ls3.remove(Integer.valueOf(20)); // Remove Element wise
        System.out.println("After remove Element wise = " + ls3);

        ls3.clear(); // Remove all Element from list
        System.out.println("Remove All Element from list = " + ls3);
    }
}