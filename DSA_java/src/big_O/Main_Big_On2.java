package big_O;

public class Main_Big_On2 {

    public static void printItems(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){ // n*n = n^2 --> O(n^2)
                for (int k=0; k<n; k++){  // n*n*n = n^3 --> O(n^3)
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
