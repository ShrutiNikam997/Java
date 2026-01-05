import java.util.*;



class FindNumber{
    void Logics(int n , int Arr[], int k)
   {
       int count = 0;
    for(int i = 0; i<n; i++)
    {
        int sum=0;
      
        for(int j = i ; j<n ; j++)
        {
              sum = sum+Arr[j];
              if(sum == k)
            {
                count++;
              }
        }
        
    }
    System.out.println(count);
   }

}


public class FindNinSubArray{
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

        System.out.println("Enter the number u want to check in Array");
        int k = sc.nextInt();

        FindNumber sobj = new FindNumber();
        sobj.Logics(n, Arr,k);

        sc.close();

    }
}