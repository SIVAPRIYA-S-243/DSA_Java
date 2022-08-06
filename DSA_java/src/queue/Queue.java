package queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

// Constructor for Queue
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

// Implementing Queue
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

// Enqueue ---> adding something to the queue
    public void enqueue(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++; // increasing the length as we add item to the queue
    }

// Dequeue --> removing first item from the queue
    public Node dequeue() {
        if (length == 0) {  // if we have 0 item in the queue
            return null;
        }
        Node temp = first;
        if (length == 1) {  // if we have 1 item in the queue
            first = null;
            last = null;
        } else {  // if we have more than 1 item in the queue
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
