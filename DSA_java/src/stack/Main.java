package stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(7);
//
//        myStack.getTop();
//        myStack.getHeight();

        myStack.push(23);
        myStack.push(3);
        myStack.push(11);

        myStack.pop(); // here we pop the last item i.e) 11

        myStack.printStack();
    }
}
