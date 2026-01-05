import java.util.*;

/*
--------------------------More Optimised Solution------------------------------------------
class Shift {
    void Calculation(int n, int Arr[]) {
        int k = 0; // index for non-zero elements
        // move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (Arr[i] != 0) {
                Arr[k] = Arr[i];
                k++;
            }
        }
        // fill remaining positions with 0
        while (k < n) {
            Arr[k] = 0;
            k++;
        }
        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
    ----------------------------------------------------------------------------------------------------------    
    */
class Shift {
    void Calculation(int n, int Arr[]) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (Arr[j] == 0) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array with all zeros shifted to right is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i] + " ");
        }

    }

}

public class ArrayShiftingZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        Shift sobj = new Shift();
        sobj.Calculation(n, Arr);

    }
}