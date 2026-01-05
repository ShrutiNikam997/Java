import java.util.*;

class Logics {
    void CheckPrime(int iNo) {
        int i;
        for (i = 2; i <= iNo / 2; i++) {
            if (iNo % i == 0) {
                System.out.println("The number is not prime Number");
                return;

            }
        }
        System.out.println("The number is a prime number");

    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int value = sc.nextInt();

        sc.close();

        Logics obj = new Logics();
        obj.CheckPrime(value);

    }
}
