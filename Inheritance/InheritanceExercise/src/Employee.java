public class Employee extends Worker
{
    private int  l_intEmployeeId;
    private String l_strEmployeeDoS; // Date of Start

    public Employee()
    {

    }
    public Employee(String l_strWorkerName, String l_strWorkerDoB, int l_intEmployeeId, String l_strEmployeeDoS)
    {
        /* Super needs to be the first part of the constructor, otherwise a compiler error appears */
        super(l_strWorkerName, l_strWorkerDoB);
        this.l_intEmployeeId = l_intEmployeeId;
        this.l_strEmployeeDoS = l_strEmployeeDoS;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "l_intEmployeeId=" + l_intEmployeeId +
                ", l_strEmployeeDoS='" + l_strEmployeeDoS + '\'' +
                "} " + super.toString();
    }
}
