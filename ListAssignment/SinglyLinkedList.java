public class SinglyLinkedList {

    public Node head;
    public SinglyLinkedList() {
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // remove a node from the end of the list
    public void remove() {
        if (head == null) {
            System.out.println("No remaining node to remove.");
        } else {
            Node currentNode = head;

            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = null;
        }
    }

    // method that print all the values of each node in order
    public void printValues() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.println(currentNode.value);

            currentNode = currentNode.next;
        }
    }
}
