import java.util.*;

class PrintNto1 {
    void Logics(int number) {

        if (number == 0) {
            return;
        }

        System.out.println(number + " ");
        Logics(number - 1);

    }
}

public class RecursionNto1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int Num = sc.nextInt();

        PrintNto1 obj = new PrintNto1();
        obj.Logics(Num);

        sc.close();
    }
}