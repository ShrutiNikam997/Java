import java.util.*;

class User {

    boolean verify(String username, String password) {

        if (username.length() < 5) {
            return false;
        }

        if (password.length() != 4) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

public class UserLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User uobj = new User();

        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {

            System.out.println("Enter username:");
            String name = sc.next();

            System.out.println("Enter password:");
            String pass = sc.next();

            if (uobj.verify(name, pass)) {
                System.out.println("Login Successful");
                success = true;
                break;
            } else {
                System.out.println("Invalid Credentials");
                attempts++;
            }
        }

        if (!success) {
            System.out.println("Account Locked");
        }

        sc.close();
    }
}
