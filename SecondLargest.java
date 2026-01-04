import java.util.*;

class Solve {
    void Logics(int n, int Arr[]) {
        int Largest = Arr[0];

        // Step 1: find largest
        for (int i = 1; i < n; i++) {
            if (Arr[i] > Largest) {
                Largest = Arr[i];
            }
        }

        // Very IMP , Like wise can find 3rd , 4th ............. largest to
        int SecondLargest_Value = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (Arr[i] != Largest && Arr[i] > SecondLargest_Value) {
                SecondLargest_Value = Arr[i];
            }
        }
        System.out.println("Second largest of array is : " + SecondLargest_Value);
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n - 1; i++) {
            Arr[i] = sc.nextInt();
        }

        Solve obj = new Solve();
        obj.Logics(n, Arr);

        sc.close();
    }
}