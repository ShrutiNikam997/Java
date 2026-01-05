import java.util.*;

class RS {
    void RevSen(String Sentence) {
        int i = 0;
        String[] words = Sentence.split(" ");
        for (i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i] + " ");

        }

    }

}

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        sc.close();

        RS obj = new RS();
        obj.RevSen(str);

    }
}
