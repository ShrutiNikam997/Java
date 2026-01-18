import java.util.*;

class BalancedParanthtesis {
    void Logics(String Str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) == '(' || Str.charAt(i) == '[' || Str.charAt(i) == '{') {
                stack.push(Str.charAt(i));
            }

            else if (Str.charAt(i) == ')' || Str.charAt(i) == ']' || Str.charAt(i) == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Non Balanced Paranthesis");
                    return;
                }

                if ((Str.charAt(i) == ')' && stack.peek() != '(') ||
                        (Str.charAt(i) == ']' && stack.peek() != '[') ||
                        (Str.charAt(i) == '}' && stack.peek() != '{')) {
                    System.out.println("Non Balanced Paranthesis");
                    return;
                }

                stack.pop();

            }

        }
        if (stack.isEmpty()) {
            System.out.println("Balanced PAranthesis");
        } else {
            System.out.println("NOn Balanced PAranthesis");
        }

    }
}

public class Stack_BalancedParanthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Input :");
        String str = sc.nextLine();

        BalancedParanthtesis obj = new BalancedParanthtesis();
        obj.Logics(str);

        sc.close();
    }
}