public class Main {
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop: // Label for the outer loop
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // If i is divisible by any j, it's not prime, so skip to the next i
                    continue outerLoop;
                }
            }
            // If we reach this point, i is prime
            System.out.println(i);
        }
    }
}
