import java.util.ArrayDeque;

public class Collection_Frmework_Array_Dequeue_using_Java {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(34);
        dq.offer(54);
        dq.offer(37);
        dq.offer(21);
        System.out.println("Print Dequeue = " + dq);
        dq.offerFirst(55);
        System.out.println("Print Dequeue Insert at First = " + dq);
        dq.offerLast(88);
        System.out.println("Print Dequeue Insert at Last = " + dq);

        System.out.println("Peek Element from Dequeue = " + dq.peek());
        System.out.println("Peek First Element from Dequeue = " + dq.peekFirst());
        System.out.println("Peek Last Element from Dequeue = " + dq.peekLast());

        System.out.println("Before Poll = " + dq);
        dq.poll();
        System.out.println("After Poll = " + dq);
        dq.pollFirst();
        System.out.println("Poll First Element from Dequeue = " + dq);
        dq.pollLast();
        System.out.println("Poll Last Element from Dequeue = " + dq);
    }
}
