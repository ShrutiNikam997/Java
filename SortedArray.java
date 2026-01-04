import java.util.*;

class Sort {
    void Logic(int n, int Arr[]) {

        for (int i = 0; i < n - 1; i++) // rounds, kiti vela comparison chalvaycha
        {
            for (int j = 0; j < n - 1; j++)// comparison
            {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");

        }
    }
}

public class SortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println(" Enter Elements");
        for (int i = 0; i <= n - 1; i++) {
            Arr[i] = sc.nextInt();
        }

        Sort sobj = new Sort();
        sobj.Logic(n, Arr);

        sc.close();

    }
}