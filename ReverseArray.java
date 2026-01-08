import java.util.*;

class RevArray {
    void logic(int n, int Arr[]) {

        System.out.println("Reversed array is:");
        for (int j = n - 1; j >= 0; j--) {

            System.out.print(Arr[j] + " ");
        }
    }
}

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("Enter No of elements in array");
        n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i <= n - 1; i++) {
            Arr[i] = sc.nextInt();
        }

        RevArray obj = new RevArray();
        obj.logic(n, Arr);

        sc.close();

    }
}