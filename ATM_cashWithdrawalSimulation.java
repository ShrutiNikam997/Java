import java.util.*;
import java.util.Scanner;

/*ATM Cash Withdrawal Simulation
Problem:
Given account balance and withdrawal amount:
If amount > balance → print “Insufficient Balance”
If amount is not multiple of 100 → print “Invalid Amount”
Else deduct amount and print remaining balance*/

class Bank {
    public void calculate(int balance, int Withdrawal_Amount) {
        if (Withdrawal_Amount % 100 != 0) {
            System.out.println("Invalid Amount");
        } else if (Withdrawal_Amount > balance) {
            System.out.println("Insufficient Balance");

        }

        else {
            int Ans = balance - Withdrawal_Amount;
            System.out.println("Amount is successfuly transacted");
            System.out.println("Remaining balance is : " + Ans);
        }

    }

}

public class ATM_cashWithdrawalSimulation {
    public static void main(String args[]) {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance:");
        iValue1 = sc.nextInt();
        System.out.println("Enter Withdrawal amount");
        iValue2 = sc.nextInt();

        Bank obj = new Bank();
        obj.calculate(iValue1, iValue2);

    }
}