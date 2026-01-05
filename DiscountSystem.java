import java.util.*;

abstract class Parent {
    double amount;

    void check(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Bill amount");
        }
    }

    abstract double CalculateBill(double amount);
}

class RegularUser {
    double CalculateBill(double amount) {

        return amount * 0.05;
    }
}

class PremiumUser {
    double CalculateBill(double amount) {
        return amount * 0.1;
    }
}

class VIPUser {
    double CalculateBill(double amount) {
        return amount * 0.2;
    }
}

public class DiscountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RegularUser obj1 = new RegularUser();
        PremiumUser obj2 = new PremiumUser();
        VIPUser obj3 = new VIPUser();

        System.out.println("Enter User type");
        int type = sc.nextInt();

        System.out.println("Enter amount");
        int amt = sc.nextInt();

        switch (type) {
            case 1:
                obj1.CalculateBill(amt);
                break;

            case 2:
                obj2.CalculateBill(amt);
                break;

            case 3:
                obj3.CalculateBill(amt);
                break;

            default:
                System.out.println("Invalid type");

        }

        sc.close();
    }
}