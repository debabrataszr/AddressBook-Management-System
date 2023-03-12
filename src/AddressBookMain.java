import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    private static List<Contact> contact = new ArrayList<Contact>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBookMain addressBook = new AddressBookMain();

        Scanner sc = new Scanner(System.in);
        int menu;
        String choice;

        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Outprint contact. ");
        System.out.println(" 4. Outprint all contacts. ");
        System.out.println(" 5. Delete contact. ");
        menu = sc.nextInt();

        while (menu != 0) {

            switch (menu) {

                case 1:
                    while (menu != 2) {
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
                        contact.add(new Contact());// Creating a new object and adding it to list
                        System.out.println("Would you like to add one more? 1: Yes, 2: No");
                        menu = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Enter First Name of contact that you would like to edit: ");
                    int index = sc.nextInt();

                    break;
                case 3:
                    System.out.println("Enter First Name of contact that you would like to delete: ");
                    choice = sc.next();
                    break;
                case 4:
                    System.out.println(addressBook.contact);
                    break;
                case 5:
                    System.out.println("Enter First Name to delete: ");
                    choice = sc.next();
                    contact.remove(choice);
                    break;
            }

            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Outprint contact. ");
            System.out.println(" 4. Outprint all contacts. ");
            System.out.println(" 5. Delete contact. ");
            menu = sc.nextInt();
        }
        System.out.println("Goodbye!");

    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, String email, long phoneno) {
        Contact person = new Contact();
        contact.add(person);
    }
}