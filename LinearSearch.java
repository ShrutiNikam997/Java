import java.util.*;

class SearchTargetUsingLS {
    void Logics(int n, int Arr[], int target) {

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (Arr[i] == target) {
                System.out.println("Element found at index:" + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Element no present in array");
        }
    }
}

public class LinearSearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of element you want in array : ");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the element one by one");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number u want to check :");
        int target = sc.nextInt();

        SearchTargetUsingLS obj = new SearchTargetUsingLS();
        obj.Logics(n, Arr, target);

    }
}