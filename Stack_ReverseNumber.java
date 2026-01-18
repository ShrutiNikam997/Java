import java.util.*;

class StackRevNumber {
    void Logics(int Num) {

        Stack<Integer> stack = new Stack<>();

        String s = Integer.toString(Num);
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i) - '0');
        }

        int rev = 0;
        while (!stack.isEmpty()) {

            rev = rev * 10 + stack.pop();
        }

        System.out.print("reversed number is :" + rev);

    }
}

public class Stack_ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num = sc.nextInt();

        StackRevNumber obj = new StackRevNumber();
        obj.Logics(num);

        sc.close();

    }
}