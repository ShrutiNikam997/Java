import java.util.*;

class FindTargetUsingBL {
    void Logics(int n, int Arr[], int target) {

        int startIndex = 0;
        int lastIndex = n - 1;
        boolean found = false;

        while (startIndex <= lastIndex) {

            int middle = (lastIndex + startIndex) / 2;

            if (Arr[middle] == target) {
                System.out.println("Target found at index" + middle);
                return;
            }

            if (target > middle) {
                startIndex = middle - 1;
            }

            if (target < middle) {
                lastIndex = middle - 1;
            }

        }

        if (!found) {
            System.out.println("target not found");
        }
    }

}

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target :");
        int target = sc.nextInt();

        FindTargetUsingBL obj = new FindTargetUsingBL();
        obj.Logics(n, Arr, target);

        sc.close();

    }
}