package linkedlist;

public class Main {

    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

// calling the method Append
        LinkedList myLinkedList = new LinkedList(1);

//        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        myLinkedList.append(3);
//        System.out.println(myLinkedList.get(2).value + "\n");

//        myLinkedList.prepend(1);

//        myLinkedList.insert(1,1);

//        myLinkedList.remove(2);

        myLinkedList.reverse();

        myLinkedList.printList();

//  calling the method removeLast

//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);  // Here we add .value to return a node
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);    // Here we add .value to return a node
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());  // Here this doesn't return a node, if we add .value then o/p will show--> Null pointer exception

// calling the method removeFirst

//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());
    }
}
