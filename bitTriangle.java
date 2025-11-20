import java.util.*;

class Logic1 {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;

        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

            System.out.println("");

        }

    }

}

public class bitTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic1 lg = new Logic1();
        lg.Repr(Value1, Value2);

    }
}