import java.util.*;

class Logic {
    void Factorials(int iNo) {

        int Result = 1;
        while (iNo > 0) {
            Result = Result * iNo;

            iNo--;
        }
        System.out.println(Result);

    }
}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int value = sc.nextInt();

        sc.close();

        Logic obj = new Logic();
        obj.Factorials(value);

    }
}
