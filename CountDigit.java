import java.util.*;

class Count {
    void CountDigit(int iNo) {
        int Digit;
        int iCount = 0;
        while (iNo > 0) {

            Digit = iNo % 10;
            iNo = iNo / 10;
            iCount++;
        }
        System.out.println(iCount);
    }

}

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int Value = sc.nextInt();

        sc.close();

        Count obj = new Count();
        obj.CountDigit(Value);
    }
}
