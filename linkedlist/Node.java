package LinkedList;

public class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }

    public void addNext(Node next) {
        this.next = next;
    }

    public String getNode() {
        return ("Data: " + this.data);
    }

    public Node getNext() {
        return this.next;
    }
}