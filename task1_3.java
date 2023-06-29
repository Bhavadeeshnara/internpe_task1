//Task 3: Create a named loop
public class task1_3 {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("    Inner Iteration " + j);

                if (j == 2) {
                    break outerLoop; // Breaking out of the outer loop
                }
            }
        }
    }
}
