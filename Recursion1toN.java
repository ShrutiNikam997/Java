import java.util.*;

class PrintNumberRecursion {
    void Logics(int number) {

        if (number == 0) {
            return;
        }

        Logics(number - 1);

        System.out.println(number + " ");

    }
}

public class Recursion1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int Num = sc.nextInt();

        PrintNumberRecursion obj = new PrintNumberRecursion();
        obj.Logics(Num);

        sc.close();
    }
}