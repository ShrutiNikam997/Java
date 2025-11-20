import java.util.*;

class Logic {
    void Represent(int iRow, int iColumn) {
        for (int i = 0; i < iRow; i++) {

            for (int j = 0; j < iColumn - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Disclaimer: Enter no of rows <= no of columns");

        System.out.print("Enter no of rows: ");
        int Value1 = sc.nextInt();

        System.out.print("Enter no of columns: ");
        int Value2 = sc.nextInt();

        sc.close();

        Logic lg = new Logic();
        lg.Represent(Value1, Value2);
    }
}