import java.util.*;

class MajorElement {
    void Calculation(int n, int Arr[]) {

        int count = 0;
        int Candidate = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                Candidate = Arr[i];
                count = 1;
            } else if (Arr[i] == Candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (Arr[i] == Candidate) {
                count++;
            }
        }

        if (count == n / 2) {
            System.out.println("Major Element is : " + Candidate);
        } else {
            System.out.println(-1);
        }
    }

}

public class ArrayMajorElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        MajorElement sobj = new MajorElement();
        sobj.Calculation(n, Arr);

        sc.close();
    }
}