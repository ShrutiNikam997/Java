import java.util.*;

class ReverseStr {
    static String Logics(String str) {
        int i;
        String rev = " ";
        for (i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        sc.close();

        String Result = ReverseStr.Logics(str);
        System.out.println("Reversed string :" + Result);

    }
}