public class Main
{
    public static void main(String[] args)
    {
        Customer l_classCustomer = new Customer("Rodrigo", "kiwi@hotmail.com", 150);

        System.out.println("Customer Name: " + l_classCustomer.get_strCustomerName());
        System.out.println("Customer email: " + l_classCustomer.get_strCustomerEmail());
        System.out.println("Customer credit limit: " + l_classCustomer.get_intCreditLimit());
    }
}