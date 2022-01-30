import java.util.Arrays;

public class Collection_Frmework_ArraysClass_using_Java {
    public static void main(String[] args) {

        // Search Element in Array
        int[] arr1 = { 2, 4, 6, 8, 9, 12, 43, 87 };
        int index = Arrays.binarySearch(arr1, 12); // Binary Search Will only possible in sorted Array
        System.out.println("Print Index of searching Element : " + index);
        System.out.println();

        // Sort an Array
        int[] arr2 = { 5, 3, 7, 12, 9, 5, 3, 24, 87 };
        System.out.print("Print Before Sort : ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(arr2); // Sorting

        System.out.print("Print After Sort : ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Fill Array
        int[] arr3 = { 3, 6, 1, 4, 2, 67, 23, 11 };
        System.out.print("Print Before Fill : ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.fill(arr3, 99); // Filling

        System.out.print("Print After Fill : ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
