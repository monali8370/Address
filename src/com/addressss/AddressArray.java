import java.util.ArrayList;
import java.util.Scanner;

public class AddressArray {
    static Scanner sc = new Scanner(System.in);
    ArrayList<AddressBook> obj = new ArrayList<>();

    public void addContact() {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter state: ");
        String state = sc.next();
        System.out.println("Enter zip: ");
        String zip = sc.next();
        System.out.println("Enter phone number: ");
        String phone = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        AddressBook ab = new AddressBook(firstName, lastName, address, city, state, zip, phone, email);
        obj.add(ab);
        System.out.println(ab);
    }

    public void editContact() {
        System.out.println("Enter your name");
        System.out.println("Enter the name for which the details to be edited: ");
        String name = sc.next();
        for (AddressBook book : obj) {
            if (book.getFirstName().equalsIgnoreCase(name)) {
                if (book.getFirstName().equals(name)) {
                    System.out.println("1. address\n2. city\n3. state\n4. zip\n5. phone\n6. email");
                    System.out.println("select option");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            String address = sc.next();
                            book.setAddress(address);
                            break;
                        case 2:
                            String city = sc.next();
                            book.setCity(city);
                            break;
                        case 3:
                            String state = sc.next();
                            book.setState(state);
                            break;
                        case 4:
                            String zip = sc.next();
                            book.setZip(zip);
                            break;
                        case 5:
                            String phone = sc.next();
                            book.setPhone(phone);
                            break;
                        case 6:
                            String email = sc.next();
                            book.setEmail(email);
                            break;
                        default:
                            System.out.println("Select correct option!!!!");
                            break;
                    }
                }
            }
            System.out.println(obj);
        }
        public void deleteContact () {
            System.out.println("Enter the name by which the contact to be deleted: ");
            String name = sc.next();
            for (AddressBook book : obj) {
                if (book.getFirstName().equals(name)) {
                    obj.remove(book);
                    break;
                }
            }
            System.out.println(obj);
        }
        public static void main (String[]args){
            AddressArray arr = new AddressArray();
            arr.addContact();
            arr.addContact();
            arr.editContact();
            arr.deleteContact();
        }
    }
}