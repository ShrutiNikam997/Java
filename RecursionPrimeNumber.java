import java.util.*;

class PrimNumberRecursion {
    void Logics(int number) {

    }
}

public class RecursionPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till which u want prime numbers");
        int Num = sc.nextInt();

        PrimNumberRecursion obj = new PrimNumberRecursion();
        obj.Logics(Num);

        sc.close();
    }
}