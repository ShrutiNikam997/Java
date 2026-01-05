import java.util.*;

class Solve1 {
    void Logics(int n, int Arr[]) {

        // step 1: store first element
        int temp = Arr[0];

        // step 2: shift elements left
        for (int i = 0; i < n - 1; i++) {
            Arr[i] = Arr[i + 1];
        }

        // step 3: put first element at last
        Arr[n - 1] = temp;

        // print array
        System.out.println("Shifted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}

public class ShiftArray {
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
        obj.Logics(n, Arr);

        sc.close();
    }
}