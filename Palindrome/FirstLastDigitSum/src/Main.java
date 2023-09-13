public class Main
{
    public static void main(String[] args)
    {
        int var = 12568;
        int lenghtVar = findOrder((int)var);

        System.out.println("Sum: " + sumFirstAndLastNumber(var));
    }
    public static int findOrder(double varNumber)
    {
        int varOrder = 0;
        while ((int)varNumber > 0)
        {
            varOrder++;
            varNumber = varNumber / 10;
        }
        return varOrder;
    }
    public static int sumFirstAndLastNumber(int varNumber)
    {
        int varOrderOp = findOrder((int)varNumber);
        int varFirstNumber = varNumber%10;
        int varLastNumber = 0;
        int sum = 0;

        if( (10^varOrderOp) > varNumber )
        {
            System.out.println("Error in logic");
        }
        else
        {
            varLastNumber = (int)(varNumber / Math.pow(10,varOrderOp-1));
        }

        sum = varFirstNumber + varLastNumber;
        return sum;
    }
}