import java.util.*;

class Logic9 {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        int number = 1;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (i >= j) {

                    System.out.print(number + " ");
                    number++;
                }

            }

            System.out.println("");

        }

    }

}

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic9 lg = new Logic9();
        lg.Repr(Value1, Value2);

    }
}