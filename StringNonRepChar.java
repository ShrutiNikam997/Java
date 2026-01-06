import java.util.*;

class StringNonRepeatingCharacter {

    void Logics(String str) {

        boolean answer = true;
        char Character = 'a';
        for (int i = 0; i <= str.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= str.length() - 1; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                answer = true;
                Character = str.charAt(i);
                break;
            } else if (count >= 1) {
                answer = false;
            }
        }
        if (answer == true) {
            System.out.println("First non repeating character is: " + Character);
        } else {
            System.out.println("No non-repeating Character");
        }

    }
}

public class StringNonRepChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        StringNonRepeatingCharacter sobj = new StringNonRepeatingCharacter();
        sobj.Logics(str);

        sc.close();

    }
}