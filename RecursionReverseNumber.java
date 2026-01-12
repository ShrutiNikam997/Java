import java.util.*;

class ReverseNumRec {
    int Logics(int num) {
        if (num == 0) {
            return 0;
        }

        int Reverse = 0;

        int iDigit = Logics(num % 10);
        Reverse = Reverse * 10 + iDigit;
        num = num / 10;

        return Reverse;
    }
}

public class RecursionReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thr number :");
        int Num = sc.nextInt();

        ReverseNumRec obj = new ReverseNumRec();
        obj.Logics(Num);

        sc.close();
    }
}