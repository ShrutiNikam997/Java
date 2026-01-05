import java.util.*;



class Continous{
    void Logics(int n , int Arr[])
    {
        
        int MaxLength =0;
       for(int i = 0; i<n; i++)
       {

        int count0 = 0;
        int count1 = 0;
        for(int j = i; j<n;j++)
        {
            if(Arr[j] == 0)
            {
                count0++;
            }
            else if (Arr[j] == 1)
            {
                count1++;
            }

            if(count0 == count1)
            {
               MaxLength = Math.max(MaxLength, j - i + 1);
            }
        }
       }
       System.out.println("RESULT: "+MaxLength);
    }

}


public class ContinousSubArray{
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

        Continous sobj = new Continous();
        sobj.Logics(n, Arr);

        sc.close();

    }
}