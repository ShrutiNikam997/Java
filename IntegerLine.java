import java.util.*;

class CheckInteger {
    int Check(int iNo) {
        if (iNo > 0)
            return 1;
        else if (iNo < 0)
            return -1;
        else
            return 0;

    }
}

public class IntegerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int iValue = sc.nextInt();

        sc.close();

        CheckInteger obj = new CheckInteger();
        int iResult = obj.Check(iValue);

        if (iResult == 1) {
            System.out.println("Number is Positive");
        } else if (iResult == -1) {
            System.out.println("Number is Negative");
        } else if (iResult == 0) {
            System.out.println("Number is zero");
        }

    }

}
