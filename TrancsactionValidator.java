import java.util.*;

class Deposit {

    void verify(int balance, int deposit_amount) {
        if (deposit_amount > 0) {
            System.out.println("transaction succesfully ,remaining balance" + balance + deposit_amount);
        }

    }

}

class Withdraw {
    void verify1(int balance, int withdrw_amount) {

        if (withdrw_amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        if (withdrw_amount % 100 != 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (withdrw_amount < balance) {
            int bal = balance - withdrw_amount;
            System.out.println("transaction successfull, remaining balance" + bal);
        }

    }

}

public class TrancsactionValidator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance");
        int bal = sc.nextInt();

        Deposit dobj = new Deposit();
        Withdraw wobj = new Withdraw();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter deposit amount");
                int d_a = sc.nextInt();
                dobj.verify(bal, d_a);
                break;

            case 2:
                System.out.println("Enter withrawal amount");
                int w_a = sc.nextInt();
                wobj.verify1(bal, w_a);
                break;

            default:
                System.out.println("Invalid transcation type");
        }

    }
}