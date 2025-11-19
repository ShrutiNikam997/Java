import java.util.*;

class Calculation {
    int FindMax(int count, int Arr[]) {
        int i;
        int iMax = Arr[0];

        for (i = 0; i < count; i++) {
            if (Arr[i] > iMax) {
                iMax = Arr[i];
            }
        }

        return iMax;
    }

}

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter no.of numbers u want to check for: ");
        int no = sc.nextInt();

        int Arr1[] = new int[no];

        System.out.println("Enter numbers: ");

        for (i = 0; i < no; i++) {
            Arr1[i] = sc.nextInt();
        }
        sc.close();

        Calculation obj = new Calculation();
        int iResult = obj.FindMax(no, Arr1);

        System.out.println("Largest Numeber is: " + iResult);

    }
}
