import java.util.*;

class Solve1 {
    void LogicsS(int n, int Arr[]) {
        int Smallest = Arr[0];

        // Step 1: find largest
        for (int i = 1; i < n; i++) {
            if (Arr[i] < Smallest) {
                Smallest = Arr[i];
            }
        }

        // Very IMP , Like wise can find 3rd , 4th ............. smallest too
        int SecondSmallest_Value = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (Arr[i] != Smallest && Arr[i] < SecondSmallest_Value) {
                SecondSmallest_Value = Arr[i];
            }
        }
        System.out.println("Second smallest of array is : " + SecondSmallest_Value);
    }
}

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        Solve1 obj = new Solve1();
        obj.LogicsS(n, Arr);

        sc.close();
    }
}