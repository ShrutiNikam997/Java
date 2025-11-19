import java.util.*;

class Calculate {
    double Calculation(double Principle, double Rate, double Time) {
        double SimpleIntrest = 0;

        SimpleIntrest = (Principle * Rate * Time);
        return SimpleIntrest;
    }

}

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle VAlue: ");
        double PrincipleValue = sc.nextDouble();

        System.out.println("Enter Rate VAlue: ");
        double RateValue = sc.nextDouble();

        System.out.println("Enter Time duration: ");
        double TimeValue = sc.nextDouble();

        sc.close();

        Calculate obj = new Calculate();
        double dRet = obj.Calculation(PrincipleValue, RateValue, TimeValue);

        System.out.println("The Simple Intrest is: " + dRet);
    }
}
