public class Node {
    Contact contact;
    Node next;

    // Construtor para inicializar o nó com um objeto Contact
    public Node(Contact contact) {
        this.contact = contact;
        this.next = null;
    }
}
