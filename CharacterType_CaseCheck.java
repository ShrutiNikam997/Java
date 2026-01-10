import java.util.*;

class Check {
    void Logics(String ch) {
        if (ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z') {
            System.out.println("Upper case");
        } else if (ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z') {
            System.out.println("Lower case");
        } else if (ch.charAt(0) >= '0' && ch.charAt(0) <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }

}

public class CharacterType_CaseCheck {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character");
        String ch = sc.nextLine();

        Check cobj = new Check();
        cobj.Logics(ch);

        sc.close();
    }
}
