import java.util.*;

class Bonus {
    void bonus_Calculation(double Salary) {
        if (Salary < 30000) {
            double bonus1 = Salary * 0.2;
            System.out.println(bonus1);
        } else if (Salary > 30000 && Salary < 50000) {
            double bonus2 = Salary * 0.1;
            System.out.println(bonus2);
        } else if (Salary > 50000) {
            System.out.println("no bonus");
        }
    }
}

public class Employee_bonus {
    public static void main(String args[]) {

        double Sal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Salary:");
        Sal = sc.nextInt();

        Bonus obj1 = new Bonus();
        obj1.bonus_Calculation(Sal);

        sc.close();
    }
}