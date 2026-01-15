import java.util.*;

class SelectionSortLogics {
    void Logics(int n, int Arr[]) {

        for (int i = 0; i < n; i++) {

            int midIndex = i;
            for (int j = i; j < n; j++) {

                if (Arr[j] < Arr[midIndex]) {
                    midIndex = j;
                }
            }

            int temp = Arr[i];
            Arr[i] = Arr[midIndex];
            Arr[midIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        SelectionSortLogics obj = new SelectionSortLogics();
        obj.Logics(n, Arr);

        sc.close();

    }
}
