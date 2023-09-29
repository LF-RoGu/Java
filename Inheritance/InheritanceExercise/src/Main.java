public class Main {
    public static void main(String[] args)
    {
        /* Example for hereditary classes Employee gets properties of Worker */
        Employee l_subClassEmployee1 = new Employee("Robert", "11/11/2000", 70007, "10/10/2020");

        System.out.println(l_subClassEmployee1);

        System.out.println("Employee Age: " + l_subClassEmployee1.workerAge());

        /* ----------------------------------------------- */
        Salary l_subSubClassEmployee2 = new Salary("Joe", "09/09/1998", 60606, "08/08/2018", 35000);

        System.out.println(l_subSubClassEmployee2);
    }
}