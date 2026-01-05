import java.util.*;



class SRValidator{
    void Logics(int n , int arr[])
    {
        

        int breakCount = 0; // counts how many times sorted order breaks

        // Step 1: check adjacent elements
        for (int i = 0; i < n - 1; i++) {

            // If current element is greater than next,
            // sorted order is broken
            if (arr[i] > arr[i + 1]) {
                breakCount++;
            }
        }

        // Step 2: check last and first element
        // This confirms the rotation connection
        if (arr[n - 1] > arr[0]) {
            breakCount++;
        }

        /*
         Valid cases:
         - breakCount == 0 → already sorted
         - breakCount == 1 → sorted and rotated
         Anything more → not valid
        */
        if (breakCount <= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}


public class ArraySortedRotatedValidator{
    public static void main(String args[])
    {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        SRValidator sobj = new SRValidator();
        sobj.Logics(n, Arr);

        sc.close();

    }
}