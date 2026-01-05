import java.util.*;

class AttendeceWithoutMedicalReasons {
    void Logic(int totalClasses, int attendedClasses) {
        if (totalClasses <= 0) {
            System.out.println("Invalid data");
            return;
        }
        if (attendedClasses > totalClasses) {
            System.out.println("Invalid data");
            return;
        }
        if (attendedClasses >= totalClasses * 0.75) {
            System.out.println("Eligible for appearing in exams*");
        } else {
            System.out.println("Not Eligible for appearing in exams");
        }
    }
}

class AttendeceWithMedicalReasons {
    void Logic1(int totalClasses, int attendedClasses) {
        if (totalClasses <= 0) {
            System.out.println("Invalid data");
            return;
        }
        if (attendedClasses > totalClasses) {
            System.out.println("Invalid data");
        }
        if (attendedClasses >= totalClasses * 0.65) {
            System.out.println("Eligible for appearing in exams");
        } else {
            System.out.println(" Not Eligible for appearing in exams");
        }
    }
}

public class ExamEligibility_AttendenceBased {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AttendeceWithMedicalReasons obj1 = new AttendeceWithMedicalReasons();
        AttendeceWithoutMedicalReasons obj2 = new AttendeceWithoutMedicalReasons();

        System.out.println("Enter total number of classes");
        int T_classes = sc.nextInt();

        System.out.println("Enter attended number of classes");
        int A_classes = sc.nextInt();

        System.out.println("Does student have Medical Certificate");
        System.out.println("1. YES");
        System.out.println("2. NO");

        int Answer = sc.nextInt();

        sc.close();

        switch (Answer) {
            case 1:
                obj1.Logic1(T_classes, A_classes);
                break;

            case 2:
                obj2.Logic(T_classes, A_classes);
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}