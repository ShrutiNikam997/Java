import java.util.*;

class NoRepCharacter {
    void Logics(String str) {
        int i;
        int count = 0;
        for (i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(str.charAt(i));
                return;
            }

        }
        if (count > 1) {
            System.out.println("No repeating character");
        }

    }
}

public class NonREpeatingCharacter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        NoRepCharacter obj = new NoRepCharacter();
        obj.Logics(str);
    }
}