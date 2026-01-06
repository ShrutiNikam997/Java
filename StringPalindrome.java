import java.util.*;

class StringPalindromeCheck {
    void Logics(String str) {

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}

public class StringPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        StringPalindromeCheck sobj = new StringPalindromeCheck();
        sobj.Logics(str);

        sc.close();

    }

}