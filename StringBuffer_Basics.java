import java.util.*;

class SB_Reverse {
    void Logics1(String str) {

        System.out.println("Original String is" + str);
        StringBuilder sb1 = new StringBuilder(str);

        sb1.reverse();
        System.out.println("Reversed String:" + sb1);

    }
}

class SB_Append {

    void Logics2(String str) {

        StringBuilder sb2 = new StringBuilder(str);

        sb2.append(" ");
        sb2.append(" is intelligent");

        System.out.println("Appended String is  :" + sb2);

    }

}

class SB_Delete {
    void Logics3(String str) {
        StringBuilder sb3 = new StringBuilder(str);

        sb3.delete(1, 4);

        System.out.println("String after delete operation  :" + sb3);
    }
}

class SB_InsertInMiddle {
    void Logics4(String str) {
        StringBuilder sb4 = new StringBuilder(str);

        sb4.insert(1, "Java");
        System.out.println("String after insertAtMiddle  operation  :" + sb4);
    }
}

class SB_DeleteCharAt {
    void Logics5(String str) {
        StringBuilder sb5 = new StringBuilder(str);
        sb5.deleteCharAt(2);
        System.out.println("String after deleteCharAt operation  :" + sb5);

    }
}

class SB_setCharAt {
    void Logics6(String str) {
        StringBuilder sb6 = new StringBuilder(str);

        sb6.setCharAt(1, 'X');
        System.out.println("String after setCharAt operation  :" + sb6);
    }
}

class SB_equals {
    void Logics7(String str) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string u want to compare with:");
        String sb_com = s.nextLine();

        StringBuilder sb7 = new StringBuilder(str);
        if (sb7.toString().equals(sb_com.toString())) {
            System.out.println("strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        s.close();

    }
}

public class StringBuffer_Basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        SB_Reverse sobj1 = new SB_Reverse();
        sobj1.Logics1(str);

        SB_Append sobj2 = new SB_Append();
        sobj2.Logics2(str);

        SB_Delete sobj3 = new SB_Delete();
        sobj3.Logics3(str);

        SB_InsertInMiddle sobj4 = new SB_InsertInMiddle();
        sobj4.Logics4(str);

        SB_DeleteCharAt sobj5 = new SB_DeleteCharAt();
        sobj5.Logics5(str);

        SB_setCharAt sobj6 = new SB_setCharAt();
        sobj6.Logics6(str);

        SB_equals sobj7 = new SB_equals();
        sobj7.Logics7(str);

        sc.close();
    }
}