import java.util.*;

class BubbleSortLogic {
    void Logics(int n, int Arr[]) {

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (Arr[i] > Arr[i + 1]) {

                    int temp = 0;

                    temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        BubbleSortLogic obj = new BubbleSortLogic();
        obj.Logics(n, Arr);

        sc.close();
    }
}