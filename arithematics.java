import java.util.*;

class arithematics1 {

    arithematics1() {
        System.out.println("Welcome to arithematics");
    }

    public int addition(int a, int b)

    {
        return a + b;
    }

    int substraction(int m, int n) {
        return m - n;
    }

}

public class arithematics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        arithematics1 a1 = new arithematics1();
        arithematics1 a2 = new arithematics1();

        System.out.println("Enter first Integer:");
        int Value1 = sc.nextInt();

        System.out.println("Enter Second Integer:");
        int Value2 = sc.nextInt();

        sc.close();

        int iRet = a1.addition(Value1, Value2);
        System.out.println("Addition:" + iRet);
        int iRet1 = a2.substraction(Value1, Value2);
        System.out.println("Substraction:" + iRet1);

    }
}
