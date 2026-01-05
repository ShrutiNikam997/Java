import java.util.*;

class EV {
    void EvenOdd(int number, int Arr1[]) {
        for (int i = 0; i < number; i++) {
            if (Arr1[i] % 2 == 0) {
                System.out.println("even numbers:" + Arr1[i]);
            } else {
                System.out.println("Odd numbers:" + Arr1[i]);
            }
        }
    }

}

public class ArrayEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        sc.close();

        EV obj = new EV();
        obj.EvenOdd(n, Arr);
    }
}
