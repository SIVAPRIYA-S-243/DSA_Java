package doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {       // Constructor
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);  // creating a new node
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

// Append

    public void append(int value) {

        Node newNode = new Node(value);  // creating a new Node

        if (length == 0) {   // when there is no items in the linked list
            head = newNode;
            tail = newNode;
        } else {             // when there is some items in the linked list
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;   // as we are adding a new node at the last, so we are incrementing the length
    }

// Remove Last
    public Node removeLast() {
        if (length == 0) {   // if there is no item in the linked list
            return null;
        }

        Node temp = tail;

        if (length == 1) {   // if there is only one item in the linked list
            head = null;
            tail = null;
        } else {            // i there is 2 or more items in the linked list
            tail = tail.prev;
            tail.next = null;
            tail.prev = null;
        }
        length--;      // as we are removing an item from the linkedList, hence we are decrementing the length by 1.
        return temp;
    }

// Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

// Remove First
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;

        if (length == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = temp;
            temp.next = null;
        }
        length--;
        return temp;
    }

// Get
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;

        if (index < length/2) {   // from starting we check, forward to backward
            for (int i=0; i<index; i++) {
                temp = temp.next;
            }
        } else {                 // from ending we check, from backward to forward
            temp = tail;
            for (int i=length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
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

        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        before.next = after;

        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
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

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }
}
