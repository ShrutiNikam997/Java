import java.util.*;

class Logics {
    void Represent(int iRow, int iColumn) {
        int i = 0;
        int j = 0;
        for (i = 1; i <= iRow; i++) {
            int starCount = 2 * i - 1;
            int spaceCount = (iColumn - starCount) / 2;

            for (j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= starCount; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}

public class Pyramid {
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