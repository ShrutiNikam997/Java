import java.util.*;

class Calculate {
    double CalcAdd(double num1, double num2) {
        double Ans1 = num1 + num2;
        return Ans1;
    }

    double CalcSub(double num1, double num2) {
        double Ans2 = num1 - num2;
        return Ans2;
    }

    double CalcMult(double num1, double num2) {
        double Ans3 = num1 * num2;
        return Ans3;
    }

    double CalcDiv(double num1, double num2) {
        double Ans4 = num1 / num2;
        return Ans4;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double Value1 = sc.nextDouble();
        System.out.println("Enter Second number");
        double Value2 = sc.nextDouble();

        System.out.println("select which operation you want to perform.");
        System.out.println("1. Addition.");
        System.out.println("2. Substraction.");
        System.out.println("3. Multiplication.");
        System.out.println("4. Division.");

        int Option = sc.nextInt();

        sc.close();

        Calculate cal = new Calculate();

        switch (Option) {
            case 1: {
                double A1 = cal.CalcAdd(Value1, Value2);
                System.out.println(A1);
            }
                break;

            case 2: {
                double A2 = cal.CalcSub(Value1, Value2);
                System.out.println(A2);
            }
                break;

            case 3: {
                double A3 = cal.CalcMult(Value1, Value2);
                System.out.println(A3);
            }
                break;

            case 4: {
                double A4 = cal.CalcDiv(Value1, Value2);
                System.out.println(A4);
            }
                break;
            default:
                System.out.println("Invalid Option");
        }

    }

}
