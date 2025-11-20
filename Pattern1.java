import java.util.*;

class Logic {
    void Represent(int iRow, int iColumn) {
        for (int i = 1; i <= iRow; i++) {
            for (int j = 1; j <= iColumn; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic lg = new Logic();
        lg.Represent(Value1, Value2);

    }
}