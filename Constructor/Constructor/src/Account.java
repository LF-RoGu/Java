public class Account
{
    private String l_strCustomerName;
    private String l_strCustomerEmail;
    private String l_strCustomerPhone;
    private int l_intCustomerAccountNum;
    private int l_intCustomerBalance;
    public Account()
    {
        System.out.println("Empty constructor");
    }
    /* Constructor for user information */
    public Account(int varCustomerAccountNum, String varCustomerName, String varCustomerEmail, String varCustomerPhone, boolean varPrintInfo)
    {
        l_strCustomerName = varCustomerName;
        l_strCustomerEmail = varCustomerEmail;
        l_strCustomerPhone = varCustomerPhone;
        l_intCustomerAccountNum = varCustomerAccountNum;

        if(varPrintInfo)
        {
            System.out.println("Customer Account Number: " + l_intCustomerAccountNum);
            System.out.println("Customer Name: " + l_strCustomerName);
            System.out.println("Customer Email: " + l_strCustomerEmail);
            System.out.println("Customer Phone: " + l_strCustomerPhone);
        }
        else
        {
            /*
            Do Nothing
             */
        }
    }
    /*
    * Constructor for Withdraw or Deposit
    * varDepositOrWithdraw [0] -> Deposit
    * varDepositOrWithdraw [1] -> Withdraw
    */
    public Account(int varCustomerDeposit, int varCustomerWithdraw, boolean varDepositOrWithdraw)
    {
        if(varDepositOrWithdraw)
        {
            l_intCustomerBalance += varCustomerDeposit;
        }
        else
        {
            l_intCustomerBalance -= varCustomerWithdraw;
        }
    }
    /* Constructor to print balance */
    public Account(int varCustomerAccountNumber, int varCustomerBalance)
    {
        System.out.println("Customer: " + varCustomerAccountNumber + "has a balance of: " + varCustomerBalance);
    }

    public void depositFunds(double varDepositAmount)
    {
        l_intCustomerBalance += varDepositAmount;
        System.out.println("Deposit amount of: $" + l_intCustomerBalance);
    }
}
