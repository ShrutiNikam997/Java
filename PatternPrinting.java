import java.util.*;

class Logic {
    void Represent(int iValue) {
        for (int i = 1; i <= iValue; i++) {

            System.out.print("*");

            System.out.println(" ");

        }

    }
}

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        sc.close();

        Logic lg = new Logic();
        lg.Represent(Value1);

    }
}