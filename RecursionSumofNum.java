import java.util.*;

class RecursionSum {
    int Logics(int number) {

        if (number == 0) {
            return 0;
        }

        return number + Logics(number - 1);
    }

}

public class RecursionSumofNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int Num = sc.nextInt();

        RecursionSum obj = new RecursionSum();
        System.out.println(obj.Logics(Num));

        sc.close();
    }
}