package linkedlist;

import java.util.Scanner;

public class LinkedList {
    int size = 0;
    Node head = null;

    public String add(int data) {
        if (this.head == null) {
            head = new Node(data);
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.getNext();
            }
            Node newNode = new Node(data);
            current.addNext(newNode);
        }
        return ("Node added Successfully");
    }

    public String displayLinkedList() {
        String display = "";
        Node current = this.head;
        while (current.getNext() != null) {
            display = display + String.valueOf(current.data) + "->";
            current = current.getNext();
        }
        return display;

    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            LinkedList linkedList = new LinkedList();
            int selectedOption = -1;
            while (selectedOption != 0) {
                System.out.println("Select the options from below:\n1.Add\n2.Display\n");
                selectedOption = in.nextInt();
                switch (selectedOption) {
                    case 0: {
                        System.exit(1);
                    }
                    case 1: {
                        System.out.println("Enter Data: ");
                        int inputData = in.nextInt();
                        String result = linkedList.add(inputData);
                        System.out.println(result);
                    }
                    case 2: {
                        System.out.println(linkedList.displayLinkedList());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Some error Occurred");
        }
    }

}
