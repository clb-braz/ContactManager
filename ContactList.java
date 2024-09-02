public class ContactList {
    private Node head;

    // Método para adicionar um novo contato ao final da lista
    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Método para buscar um contato pelo nome ou número de telefone
    public Contact searchContact(String nameOrPhone) {
        Node temp = head;
        while (temp != null) {
            if (temp.contact.getName().equals(nameOrPhone) || temp.contact.getPhoneNumber().equals(nameOrPhone)) {
                return temp.contact;
            }
            temp = temp.next;
        }
        return null;
    }

    // Método para remover um contato pelo nome ou número de telefone
    public void removeContact(String nameOrPhone) {
        if (head == null) return;

        if (head.contact.getName().equals(nameOrPhone) || head.contact.getPhoneNumber().equals(nameOrPhone)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.contact.getName().equals(nameOrPhone) || temp.next.contact.getPhoneNumber().equals(nameOrPhone)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Método para listar todos os contatos
    public void listContacts() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No contacts found.");
            return;
        }
        while (temp != null) {
            System.out.println(temp.contact);
            temp = temp.next;
        }
    }
}
