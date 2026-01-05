import java.util.*;

/*Charges
Bike → ₹10 per hour
Car → ₹20 per hour
Truck → ₹30 per hour */

class Vehicle {
    double hours;

    void check(double hours) {
        if (hours <= 0) {
            System.out.println("Invalid Parking Duration");
        }
    }
}

class Bike extends Vehicle {

    void Calc1(double hours) {
        System.out.println("total parking fee" + hours * 10);
    }
}

class Car extends Vehicle {
    void calc2(double hours) {
        System.out.println("total parking fee" + hours * 20);
    }
}

class Truck extends Vehicle {
    void calc3(double hours) {
        System.out.println("total parking fee" + hours * 30);
    }
}

public class ParkingLotFee_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike bobj = new Bike();
        Car cobj = new Car();
        Truck tobj = new Truck();

        System.out.println("Enter Vehicle type: ");
        int type = sc.nextInt();

        System.out.println("Enter number of hours");
        int hrs = sc.nextInt();

        switch (type) {
            case 1:
                bobj.Calc1(hrs);
                break;

            case 2:
                cobj.calc2(hrs);
                break;

            case 3:
                tobj.calc3(hrs);
                break;

            default:
                System.out.println("Invalid vehicle type");

        }

    }
}