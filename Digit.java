import java.util.*;

class NumberDigit {
    int Digit;

    void Digits(int iNo) {

        while (iNo != 0) {
            Digit = iNo % 10;
            System.out.println(Digit);
            iNo = iNo / 10;
        }

    }

}

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int Value = sc.nextInt();

        sc.close();

        NumberDigit obj = new NumberDigit();
        obj.Digits(Value);

    }
}
