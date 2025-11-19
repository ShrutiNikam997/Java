import java.util.*;

class Reverse {
    int Digit = 0;
    int irev = 0;

    int Digit1 = 0;
    int irev1 = 0;

    void ReverseDigit(int iNo) {

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo > 0) {

            Digit = iNo % 10;
            irev = (irev * 10) + Digit;
            iNo = iNo / 10;
        }
        System.out.println(irev);

    }

    void reReverse() {
        while (irev > 0) {
            Digit1 = irev % 10;
            irev1 = (irev1 * 10) + Digit1;
            irev = irev / 10;
        }
        System.out.println(irev1);
    }

}

public class DoubleReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int Value = sc.nextInt();

        sc.close();

        Reverse obj = new Reverse();
        obj.ReverseDigit(Value);
        obj.reReverse();
    }
}
