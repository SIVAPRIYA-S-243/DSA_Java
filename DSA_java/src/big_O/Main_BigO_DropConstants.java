package big_O;

public class Main_BigO_DropConstants {

    public static void printItems(int n) {
        for (int i=0; i<n; i++) {
            System.out.println(i);
        }
        for (int j=0; j<n; j++) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printItems(10);   // n + n = 2n --> O(2n) --> O(n) - Dropping constant 2, called Drop Constant.
    }
}
