import java.util.*;

class P {
    void VC(String word) {
        int Vowel = 0;
        int Consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                Vowel++;
            } else {
                Consonants++;
            }

        }
        System.out.println("The number of vowels are:" + Vowel);
        System.out.println("The number of consonants are:" + Consonants);

    }

}

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        sc.close();

        P obj = new P();
        obj.VC(str);

    }
}
