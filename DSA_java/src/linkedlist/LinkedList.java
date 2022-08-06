package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {                // Node Class is the "Inner Class (Nested Class)" of LinkedList Class.
        int value;
        Node next;   // variable next points to the next Node & it is the pointer to the node.

        Node(int value) {       // Constructor
            this.value = value;
        }
    }

    public LinkedList(int value) {     // Class
        Node newNode = new Node(value);   // new --> this runs the Constructor
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {   // Method
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);  // .value is must--> dot & value is must
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

// Append
    public void append(int value) {

        Node newNode = new Node(value);  // creating a new node

        if (length == 0) {      // if we have an Empty Linked List
            head = newNode;
            tail = newNode;
        } else {                // if we have items in the Linked List
            tail.next = newNode;
            tail = newNode;
        }
        length++;     // as we are adding thr item, we are incrementing-increasing the length
    }

// Remove Last
    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;  // as we are removing an item from the list, so decrementing

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    
// Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

// Remove first
    public Node removeFirst() {
        if (length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

// Get
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

// Insert
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp  = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

// Set
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

// Remove
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

// Reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i=0; i<length; i++) {
            after =temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
