import java.util.*;

class LW {
    void LonSho(String Sentence) {
        int i = 0;
        String[] words = Sentence.split(" ");
        String Longest = words[0];
        String Shortest = words[0];

        for (i = 0; i < words.length; i++) {

            if (words[i].length() > Longest.length()) {
                Longest = words[i];
            }

            if (words[i].length() < Shortest.length()) {
                Shortest = words[i];
            }

        }
        System.out.println("The longest word is:" + Longest);
        System.out.println("The shortest word is:" + Shortest);

    }

}

public class LongestShortest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        sc.close();

        LW obj = new LW();
        obj.LonSho(str);

    }
}
