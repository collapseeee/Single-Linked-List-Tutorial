public class LinkedList {
    // Attribute:
    private Node head;
    private int size;

    // Constructor:
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Method:
    public void insert(CovidVaccine data) { // Perform insertion at the end of the node.
        Node newNode = new Node(data);

        if (head == null) { // If the list is empty, insert a new node.
            head = newNode;
            System.out.println(data.toString() + " is inserted as the head.");
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            System.out.println(data.toString() + " is inserted.");
        }
        size++;
    }
    public void traverse() {
        Node current = head;
        while (current.getNext() != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
