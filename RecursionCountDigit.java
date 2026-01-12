import java.util.*;

class CountDigitRec {
    int Logics(int Num) {
        if (Num == 0) {
            return 0;
        }

        return 1 + Logics(Num / 10);

    }
}

public class RecursionCountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        CountDigitRec obj = new CountDigitRec();
        System.out.println(obj.Logics(num));
    }
}