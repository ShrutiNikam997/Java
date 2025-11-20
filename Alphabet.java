import java.util.*;

class Logic {
    void Repr(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        char Alphabet = 'A';

        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iColumn; j++) {
                if (j <= i) {
                    System.out.print(Alphabet);
                    Alphabet++;
                }

            }

            System.out.println("");

        }

    }

}

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int Value1 = sc.nextInt();

        System.out.println("Enter no of columns");
        int Value2 = sc.nextInt();

        sc.close();

        Logic lg = new Logic();
        lg.Repr(Value1, Value2);

    }
}