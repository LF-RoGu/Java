public class Main {
    public static void main(String[] args)
    {
        System.out.println("Factors of a number");
        factors(32);
    }
    public static void factors(int factorialOrder) {
        int varFactorial = 1;
        int resFactorial = 1;

        for (int i = 1; i <= factorialOrder; i++) {
            if ((factorialOrder % i) == 0)
            {
                System.out.println("Factor numbers of " + factorialOrder + ": " + i);
            }
            else
            {
                /*
                Do Nothing
                 */
            }
        }
    }
}