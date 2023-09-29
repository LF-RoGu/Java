import java.util.Calendar;

public class Worker
{
    private String l_strWorkerName;
    private String l_strWorkerDoB; // Date of Birth
    private String l_strWorkerEoD; // End of Date

    public Worker()
    {

    }
    public Worker(String l_strWorkerName, String l_strWorkerDoB) {
        this.l_strWorkerName = l_strWorkerName;
        this.l_strWorkerDoB = l_strWorkerDoB;
    }

    public int workerAge()
    {
        Calendar l_varCurrentTime = Calendar.getInstance();

        return l_varCurrentTime.get(Calendar.YEAR) - Integer.parseInt(l_strWorkerDoB.substring(6));
    }

    public void set_strWorkerEoD(String varEndDate)
    {
        this.l_strWorkerEoD = varEndDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "l_strWorkerName='" + l_strWorkerName + '\'' +
                ", l_strWorkerDoB='" + l_strWorkerDoB + '\'' +
                ", l_strWorkerEoD='" + l_strWorkerEoD + '\'' +
                '}';
    }
}
