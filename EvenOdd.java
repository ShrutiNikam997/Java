import java.util.*;

class EvenOddLogic {
    EvenOddLogic() {
        System.out.println("welcome to Evenodd program");
    }

    boolean flag;

    void CheckEven(int iNo) {
        if ((iNo % 2) == 0) {
            flag = true;
        } else {
            flag = false;
        }
    }

}

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which u want to check");
        int iValue = sc.nextInt();

        sc.close();

        EvenOddLogic obj = new EvenOddLogic();
        obj.CheckEven(iValue);

        if (obj.flag == true) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given numebr is odd");
        }

    }

}
