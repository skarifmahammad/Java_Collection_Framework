import java.util.PriorityQueue;
import java.util.Comparator;

public class Collection_Frmework_LinkedList_PriorityQueue_using_Java {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(23);
        pq.add(32);
        pq.add(67);
        pq.add(12);
        pq.add(34);
        System.out.println("Print PriorityQueue with low Priority = " + pq);
        System.out.println("Peek Element from Priority Queue = " + pq.peek());
        System.out.println("poll = " + pq.poll());
        System.out.println("Print PriorityQueue = " + pq);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(2);
        pq2.add(34);
        pq2.add(65);
        pq2.add(114);
        pq2.add(39);
        System.out.println("Print PriorityQueue with High Priority = " + pq2);

    }
}
