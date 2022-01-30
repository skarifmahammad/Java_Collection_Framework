class calculate {
    int x;
    int y;
    int sum;

    // public calculate(int number1, int number2) {
    // num1 = number1;
    // num2 = number2;
    // // Left Side veriable are 'Instance Variable' and
    // // Right side variable are 'Local Variable';
    // }
    public calculate(int x, int y) {
        this.x = x; // "This" keyword represent Current Object
        this.y = y;
        // Left Side veriable are 'Instance Variable' and
        // Right side variable are 'Local Variable';
    }

    public void result() {
        sum = x + y;
        System.out.println(sum);
    }
}

public class Collection_Frmework_This_Keyword_using_Java {
    public static void main(String[] args) {
        calculate obj = new calculate(5, 7);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.print("Sum = ");
        obj.result();
    }
}