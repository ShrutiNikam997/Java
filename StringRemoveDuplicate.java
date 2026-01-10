import java.util.*;

class RemoveDuplicate {

    String logic(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isDuplicate = false;

            // check if current character appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to result
            if (!isDuplicate) {
                result = result + current;
            }
        }

        return result;
    }
}

public class StringRemoveDuplicate {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        RemoveDuplicate obj = new RemoveDuplicate();
        String output = obj.logic(str);

        System.out.println("String after removing duplicates:");
        System.out.println(output);

        sc.close();
    }
}