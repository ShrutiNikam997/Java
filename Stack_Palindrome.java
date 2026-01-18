import java.util.*;

class StackPalindrome {
    void Logics(String Str) {

        Stack<Character> stack = new Stack<>();

        boolean Condition = false;

        for (int i = 0; i < Str.length(); i++) {
            stack.push(Str.charAt(i));
        }

        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) == stack.pop()) {
                Condition = true;
            } else {
                Condition = false;
                break;
            }

        }

        if (Condition == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not PAlindrome");
        }

    }
}

public class Stack_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        StackPalindrome obj = new StackPalindrome();
        obj.Logics(str);

        sc.close();
    }

}