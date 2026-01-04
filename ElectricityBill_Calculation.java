import java.util.*;

class ElectricityBill {
    void Calculation(int unit) {
        if (unit < 0) {
            System.out.println("Invalid input");

        } else if (unit > 0 && unit <= 100) {
            System.out.println(unit * 5);

        } else if (unit > 100 && unit <= 200) {
            System.out.println(unit * 7);

        } else if (unit > 200 && unit <= 300) {
            System.out.println(unit * 10);
        }

    }

}

public class ElectricityBill_Calculation {
    public static void main(String args[]) {

        int units_value = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("units:");
        units_value = sc.nextInt();

        ElectricityBill obj1 = new ElectricityBill();
        obj1.Calculation(units_value);

        sc.close();
    }
}