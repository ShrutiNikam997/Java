import java.util.*;

class StringAnagramCheck {

    void Logics(String str1, String str2) {

        int charCount = 0;
        int yesCount = 0;
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            System.out.println("String is not anagram");
            return;
        }

        for (int i = 0; i <= str1.length() - 1; i++) {

            for (int j = 0; j <= str1.length() - 1; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    charCount++;
                }
            }

            for (int k = 0; k <= str2.length() - 1; k++) {

                if (str1.charAt(i) == str2.charAt(k)) {
                    yesCount++;
                }
            }

            if (yesCount == charCount) {
                isAnagram = true;

            } else {

                isAnagram = false;
                break;
            }

        }
        if (isAnagram == true) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not anagram");
        }

    }
}

public class StringAnagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the string that u want to compare with     :");
        String str2 = sc.nextLine();

        StringAnagramCheck sobj = new StringAnagramCheck();
        sobj.Logics(str1, str2);

        sc.close();

    }
}