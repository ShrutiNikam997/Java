import java.util.*;

/*Why int is WRONG for passwords (real reasons)
Leading zero problem (this alone kills int)
Password entered: 0121
If you use int:
int p = 0121;   // becomes 121 
You lose information.
Using String:
"0121"  preserved
Password length matters, numeric value does NOT
"0001" → valid 4-digit password
"1"    → NOT valid */

class Verification {

    void isValid(String password) {

        int i = 0;
        int j = password.length() - 1;
        if (password.length() != 4) {
            System.out.println("Invalid password");
            return;
        }

        for (int n = 0; n < 4; n++) {
            if (!Character.isDigit(password.charAt(n))) {
                System.out.println("Invalid Password");
                return;
            }

        }
        while (i < j) {
            if (password.charAt(i) == password.charAt(j)) {
                System.out.println("Valid Password");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Invalid Password");

    }
}

public class Password_Validation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit Password:");
        String Arr = sc.next();

        Verification vobj = new Verification();
        vobj.isValid(Arr);

        sc.close();
    }
}
