import java.util.*;

class P {
    void Palindromee(String word) {
        int i = 0;
        int j = word.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (word.charAt(i) == word.charAt(j)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
            i++;
            j--;

        }
        if (isPalindrome == true) {

            System.out.println("Stirng is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }

}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        sc.close();

        P obj = new P();
        obj.Palindromee(str);

    }
}
