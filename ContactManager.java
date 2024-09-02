import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();

        while (true) {
            System.out.println("\n1. Add  2. Search  3. Remove  4. List  5. Exit");
            
            int option = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    option = scanner.nextInt();
                    scanner.nextLine();  // Limpar buffer
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number (1-5).");
                    scanner.nextLine();  // Limpar buffer para evitar loop infinito
                }
            }

            if (option == 5) break;

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    contactList.addContact(new Contact(name, phone, email));
                    break;
                case 2:
                    System.out.print("Search by Name or Phone: ");
                    String search = scanner.nextLine();
                    Contact found = contactList.searchContact(search);
                    System.out.println(found != null ? found : "Not found");
                    break;
                case 3:
                    System.out.print("Remove by Name or Phone: ");
                    String remove = scanner.nextLine();
                    contactList.removeContact(remove);
                    break;
                case 4:
                    contactList.listContacts();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }
}
