import java.util.Stack;

public class Collection_Frmework_Stack_using_Java {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        stk.push(3);
        stk.push(6);
        stk.push(2);
        stk.push(9);
        stk.push(1);
        System.out.println("Print Stack = " + stk);
        System.out.println("Print top Element of Stack = " + stk.peek());

        stk.pop(); // Remove Element from Stack;
        System.out.println("Print Stack after pop = " + stk);
        System.out.println("Print top Element of Stack after pop = " + stk.peek());

    }
}
