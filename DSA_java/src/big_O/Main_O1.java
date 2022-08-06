package big_O;

public class Main_O1 {

// O(1)

    public static int printItems(int n) {
        return n + n;
    }

    public static void main(String[] args) {
        System.out.println(printItems(3));
    }
}
