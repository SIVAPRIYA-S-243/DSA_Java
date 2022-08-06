package doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);  // Calling the Class

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

//  --- Append ---
//        myDLL.append(1);
//        myDLL.append(3);
//        myDLL.append(2);

//  --- Prepend ---
//        myDLL.prepend(1);

//  --- Remove Last ---
//        // (2) Items - Return 2 Node
//        System.out.println(myDLL.removeLast().value);
//        // (1) Item - Return 1 Node
//        System.out.println(myDLL.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myDLL.removeLast());

//  --- Remove First ---
//        // (2) Items - Return 2 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (1) Item - Return 1 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myDLL.removeFirst());

//  --- Get ---
//        System.out.println(myDLL.get(1).value);
//        System.out.println(myDLL.get(2).value + "\n");

//  --- Set ---
//        myDLL.set(1, 4);

//  --- Insert ---
//        myDLL.insert(1, 2);

//  --- Remove ---
//        myDLL.remove(1);

        myDLL.append(3);

        myDLL.insert(1,2);

        myDLL.printList();
    }
}
