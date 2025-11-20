import java.util.*;

class Logic3 {
    void Represents(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (j == 1 || i == iRow || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}

public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic3 lg = new Logic3();
        lg.Represents(Value1, Value2);

    }
}