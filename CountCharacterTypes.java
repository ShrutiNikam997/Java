import java.util.*;

class CountTypesOfChar {
    void Logics(String ch) {
        int i = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
        for (i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z') {
                upperCaseCount++;
            } else if (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z') {
                lowerCaseCount++;
            } else if (ch.charAt(i) >= '0' && ch.charAt(i) <= '9') {
                digitCount++;
            } else {
                specialCharacterCount++;
            }
        }

        System.out.println("Total upper-case Characters :" + upperCaseCount);
        System.out.println("Total lower-case Characters :" + lowerCaseCount);
        System.out.println("Total digit characters: " + digitCount);
        System.out.println("Total special character count :" + specialCharacterCount);

    }

}

public class CountCharacterTypes {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character");
        String ch = sc.nextLine();

        CountTypesOfChar cobj = new CountTypesOfChar();
        cobj.Logics(ch);

        sc.close();
    }
}
