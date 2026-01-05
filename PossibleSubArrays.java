import java.util.*;



class PossibleSA{
    void Logics(int n , int Arr[])
   {

    for(int i = 0; i<n; i++)
    {
        for(int j = i ; j<n ; j++)
        {
             for (int k = i; k <= j; k++) {
                    System.out.print(Arr[k] + " ");
                }
                System.out.println(); 
        }
    }
   }

}


public class PossibleSubArrays{
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

        PossibleSA sobj = new PossibleSA();
        sobj.Logics(n, Arr);

        sc.close();

    }
}