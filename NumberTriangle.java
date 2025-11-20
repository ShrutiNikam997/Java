import java.util.*;

class Logic5 {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
            }
            System.out.println();

        }

    }

}

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic5 lg = new Logic5();
        lg.Repr(Value1, Value2);

    }
}