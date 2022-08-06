package big_O;

public class DifferentTermsForInputs {

// O(a + b)
    public static void printItems(int a, int b) {
        for (int i=0; i<a; i++){
            System.out.println(i);
        }
        for (int j=0; j<b; j++) {
            System.out.println(j);
        }
    }

// O(a * b)
    public static void printItems1(int a, int b) {
        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        printItems(2,3);
    }
}
