import java.util.*;

class Permanent {
    void Calculate(String Employee_Id, String Employee_name, double BasicSalary) {
        double HRA = BasicSalary * 0.2;
        double DA = BasicSalary * 0.1;

        double Total_Salary = BasicSalary + HRA + DA;

        System.out.println("Employee Id : " + Employee_Id);
        System.out.println("Employee name : " + Employee_name);
        System.out.println("Employee Type : Permanent");
        System.out.println("Monthly Salary : " + Total_Salary);

    }

}

class Contract {

    void Calculate(String Employee_Id, String Employee_name, double Hourly_Rate, double Hours_Worked) {
        double Total_Salary = Hourly_Rate * Hours_Worked;

        System.out.println("Employee Id : " + Employee_Id);
        System.out.println("Employee name : " + Employee_name);
        System.out.println("Employee Type : Contract");
        System.out.println("Monthly Salary : " + Total_Salary);
    }

}

public class Employee_PayRoll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Permanent pobj = new Permanent();
        Contract cobj = new Contract();

        System.out.println("Enter Employee type: ");
        int Answer = sc.nextInt();

        switch (Answer) {
            case 1:
                System.out.println("Enter Employee id");
                String id1 = sc.next();

                System.out.println("Enter Employee name");
                String name1 = sc.next();

                System.out.println("Enter basic salary");
                double sal = sc.nextDouble();

                pobj.Calculate(id1, name1, sal);

                break;

            case 2:
                System.out.println("Enter Employee id");
                String id2 = sc.next();

                System.out.println("Enter Employee name");
                String name2 = sc.next();

                System.out.println("Enter hourly rate");
                double h_rate = sc.nextDouble();

                System.out.println("Enter hous worked");
                double h_Worked = sc.nextDouble();

                cobj.Calculate(id2, name2, h_rate, h_Worked);

                break;

            default:
                System.out.println("Invalid Choice");

        }

    }
}