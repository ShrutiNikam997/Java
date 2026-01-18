import java.util.*;

class StackRevStr {
    void Logics(String Str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < Str.length(); i++) {
            stack.push(Str.charAt(i));
        }

        String reverse = " ";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        System.out.println("Reverse String :" + reverse);
    }

}

public class Stack_ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sc.nextLine();

        StackRevStr obj = new StackRevStr();
        obj.Logics(str);

        sc.close();

    }
}