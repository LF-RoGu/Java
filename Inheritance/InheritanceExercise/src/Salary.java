import java.util.Calendar;
public class Salary extends Employee
{
    private int l_intSalary;
    private boolean l_boolInRetired;

    public Salary(String l_strWorkerName, String l_strWorkerDoB, int l_intEmployeeId, String l_strEmployeeDoS, int l_intSalary) {
        super(l_strWorkerName, l_strWorkerDoB, l_intEmployeeId, l_strEmployeeDoS);
        this.l_intSalary = l_intSalary;
    }

    private void set_boolInRetired(boolean varIsRetired)
    {
        this.l_boolInRetired = varIsRetired;
    }
    public void set_retireDate(String varRetireYear)
    {
        Calendar l_varCurrentTime = Calendar.getInstance();
        set_boolInRetired(varRetireYear.equals(l_varCurrentTime.get(Calendar.YEAR)));
    }

    public void get_retireEmployee()
    {
        if(this.l_boolInRetired)
        {
            System.out.println(this.l_intSalary*0.9);
        }
        else
        {
            System.out.println("Employee is not retired");
        }
    }

    @Override
    public String toString() {
        return "Salary{" +
                "l_intSalary=" + l_intSalary +
                "} " + super.toString();
    }
}
