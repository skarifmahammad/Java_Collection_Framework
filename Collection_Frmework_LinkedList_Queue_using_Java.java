import java.util.LinkedList;
import java.util.Queue;

public class Collection_Frmework_LinkedList_Queue_using_Java {
    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();
        qu.offer(12);
        qu.offer(27);
        qu.offer(64);
        qu.offer(34);
        System.out.println("Print Queue = " + qu);
        System.out.println("Remove Element from Queue = " + qu.poll());
        System.out.println("Queue after Deletion = " + qu);
        System.out.println("Next Delete Element from Queue = " + qu.peek());
    }
}
