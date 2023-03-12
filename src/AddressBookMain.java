import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {


    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBookMain addressBook = new AddressBookMain();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter state: ");
        String state = sc.next();
        System.out.println("Enter zipcode: ");
        int zip = sc.nextInt();
        System.out.println("Enter phone no.: ");
        long phoneno = Long.parseLong(sc.next());
        System.out.println("Enter email: ");
        String email = sc.next();
    }
}