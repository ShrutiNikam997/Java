import java.util.*;

class StringVowelCheck {
    void Logics(String str) {

        int frequencyVowel =0;
        for(int i = 0; i<= str.length()-1; i++)
        {
            
            if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'||str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U')
            {

                frequencyVowel++;
            }
        }
        System.out.println("Total vowels in string are:"+frequencyVowel);

    }}

public class StringCountVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        StringVowelCheck sobj = new StringVowelCheck();
        sobj.Logics(str);

        sc.close();

    }

}