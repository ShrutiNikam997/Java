import java.util.*;

class Logic4 {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (j <= iColumn - i + 1) {

                    System.out.print(j);
                }

            }
            System.out.println("");

        }

    }

}

public class InvertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic4 lg = new Logic4();
        lg.Repr(Value1, Value2);

    }
}