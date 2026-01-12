import java.util.*;

class FactorialRec {
    int Logics(int Num) {

        if (Num == 1) {
            return 1;
        }

        return Num * Logics(Num - 1);

    }
}

public class RecursionFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        FactorialRec obj = new FactorialRec();
        System.out.println(obj.Logics(num));

        sc.close();
    }

}