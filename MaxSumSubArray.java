import java.util.*;



class MaxSumSubA{
    void Logics(int n , int Arr[])
   {
    
     int MaxSum = Arr[0];
    for(int i = 0; i<n; i++)
    {
        int sum=0;
        for(int j = i ; j<n ; j++)
        {
              sum = sum+Arr[j];
              MaxSum = Math.max(MaxSum, sum);
        }
        
    }
    System.out.println(MaxSum);
   }

}


public class MaxSumSubArray{
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

        MaxSumSubA sobj = new MaxSumSubA();
        sobj.Logics(n, Arr);

        sc.close();

    }
}