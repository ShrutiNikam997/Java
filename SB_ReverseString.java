import java.util.*;

class SB_RevStr {
    void Logics(String Str) {

        StringBuilder sb = new StringBuilder(Str);

        sb.reverse();
        System.out.println("Reversed String :" + sb);
    }
}

public class SB_ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        SB_RevStr sobj = new SB_RevStr();
        sobj.Logics(str);

        sc.close();
    }
}