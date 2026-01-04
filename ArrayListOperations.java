import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<Integer> Arrlist = new ArrayList<>();

        // Add
        Arrlist.add(10);
        Arrlist.add(20);
        Arrlist.add(30);
        Arrlist.add(40);
        Arrlist.add(50);
        System.out.println("Array is : " + Arrlist);

        // get element
        System.out.println("element at in dex 2 is : " + Arrlist.get(2));

        // set element
        Arrlist.set(1, 60);
        System.out.println("Updated Array is " + Arrlist);

        // remove element
        Arrlist.remove(3);
        System.out.println("array after deletion of element on index 3" + Arrlist);

        // remove by value
        System.out.println("Remove by value" + Arrlist.remove(Integer.valueOf(40)));

        // search element
        System.out.println("Array contains 50?" + Arrlist.contains(50));

        // sort
        Collections.sort(Arrlist);
        System.out.println("Sorted array is" + Arrlist);

        // reverse
        Collections.reverse(Arrlist);
        System.out.println("Reversed array is" + Arrlist);

        // shuffle
        Collections.shuffle(Arrlist);
        System.out.println("Shuffled array is " + Arrlist);

        // Iterate using for each
        System.out.println("After using for each loop");
        for (int num : Arrlist) {
            System.out.println(num);
        }
        System.out.println(" ");

        // Iterate using Iterator

        Iterator<Integer> it = Arrlist.iterator();
        System.out.println("After using Iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //isEmpty
        if(Arrlist.isEmpty())
        {
            System.out.println("List is empty");
        }

       
        

        //Convert Arraylist to Arrray
        Integer[ ]arr = Arrlist.toArray(new Integer[0]);

        //Convert Array to Arraylist
        Integer[] a = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));

        //IndexOf & LastIndexOf
       System.out.println("Index of 30: " + Arrlist.indexOf(30));
        System.out.println("Last index of 30: " + Arrlist.lastIndexOf(30));

        //Size 
        Arrlist.size();
        System.out.println("Size of list: " + Arrlist.size());

         //clear ArrayList
        Arrlist.clear();
        System.out.println("Size of list after clear : " + Arrlist.size());



        //Practice Questions
        System.out.println("Problem: Remove all even numbers from an ArrayList");
        Arrlist.add(10);
        Arrlist.add(15);
        Arrlist.add(15);
        Arrlist.add(20); 
        Arrlist.add(25);
        Arrlist.add(30);
         Arrlist.add(31);
        Arrlist.add(35);
         Arrlist.add(93);
          Arrlist.add(93);

        System.out.println("New element added o array now array is:"+Arrlist);
        for (int i = 0; i < Arrlist.size(); i++) 
        {
            if (Arrlist.get(i) % 2 == 0) 
            {
                Arrlist.remove(i);
                i--; // VERY IMPORTANT
            }
        
        }
     


        //correct method
        Iterator<Integer> it1 = Arrlist.iterator();

        while (it1.hasNext()) 
        {
            int val = it1.next();
            if (val % 2 == 0) 
            {
                it1.remove(); // SAFE removal
            }
        }
        System.out.println("Array After removing even elements"+Arrlist);


        //frequency of one element

        int count = 0;
        int element = 93;

        for(int i = 0; i<Arrlist.size(); i++)
        {
            if(Arrlist.get(i) == element)
            {
                count++;
            }
        }
        System.out.println("Frequency of 93 element is : "+count);

        //Frequeny of each element
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int x: Arrlist)
        {
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        System.out.println("Frequency of each element"+freq);


    
    }
}