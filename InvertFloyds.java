import java.util.*;

class Logic2 {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        int number = (iRow * (iRow + 1)) / 2;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (j <= iColumn - i + 1) {

                    System.out.print(number + " ");
                    number--;
                }

            }

            System.out.println("");

        }

    }

}

public class InvertFloyds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic2 lg = new Logic2();
        lg.Repr(Value1, Value2);

    }
}