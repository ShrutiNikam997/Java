import java.util.*;

class MM {
    void Max(int n, int Arr[]) {
        int iMax = Arr[0];
        for (int i = 0; i <= n - 1; i++) {

            if (Arr[i] > iMax) {
                iMax = Arr[i];
            }
        }
        System.out.println("Maximum element of array:" + iMax);

    }

    void Min(int n, int Arr[]) {

        int iMin = Arr[0];
        for (int i = 0; i <= n - 1; i++) {

            if (Arr[i] < iMin) {
                iMin = Arr[i];
            }
        }
        System.out.println("Minimum element of array:" + iMin);

    }
}

public class ArrayMaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println(" Enter Elements");
        for (int i = 0; i <= n - 1; i++) {
            Arr[i] = sc.nextInt();
        }

        MM mobj = new MM();
        mobj.Max(n, Arr);
        mobj.Min(n, Arr);
    }
}