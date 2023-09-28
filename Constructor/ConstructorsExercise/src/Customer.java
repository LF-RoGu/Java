public class Customer
{
    private String l_strCustomerName;
    private int l_intCreditLimit;
    private String l_strCustomerEmail;

    public Customer(String varCustomerName, String varCustomerEmail, int varCreditLimit)
    {
        this.l_strCustomerName = varCustomerName;
        this.l_strCustomerEmail = varCustomerEmail;
        this.l_intCreditLimit = varCreditLimit;
    }

    public String get_strCustomerName()
    {
        return this.l_strCustomerName;
    }
    public String get_strCustomerEmail()
    {
        return this.l_strCustomerEmail;
    }
    public int get_intCreditLimit()
    {
        return this.l_intCreditLimit;
    }
}
