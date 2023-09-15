public class Students
{
    private String l_varUserName;
    private String l_varUserId;
    private String l_varUserProgram;
    private String l_varUserEnrollmentYear;
    private String l_varUserAverageScore;

    /*
    Java example for Getters using classes for private information
     */

    public String getUserName()
    {
        return l_varUserName;
    }
    public String getUserId()
    {
        return l_varUserId;
    }
    public String getUserProgram()
    {
        return l_varUserProgram;
    }
    public String getUserEnrollmentYear()
    {
        return l_varUserEnrollmentYear;
    }
    public String getUserAverageScore()
    {
        return l_varUserAverageScore;
    }

    /*
    Java example for Setters using classes for private information
     */
    public void setUserName(String varUserInfo)
    {
        if(this.l_varUserName == null)
        {
            this.l_varUserName = varUserInfo;
        }
        else
        {
            this.l_varUserName = "Unknown";
        }

    }
    public void setUserId(String varUserInfo)
    {
        this.l_varUserId = varUserInfo;
    }
    public void setUserProgram(String varUserInfo)
    {
        this.l_varUserProgram = varUserInfo;
    }
    public void setUserEnrollmentYear(String varUserInfo)
    {
        this.l_varUserEnrollmentYear = varUserInfo;
    }
    public void setUserAverageScore(String varUserInfo)
    {
        this.l_varUserAverageScore = varUserInfo;
    }

    /* Print out user information */
    public void studentCardInfo()
    {
        System.out.println("Student Name: " + l_varUserName);
        System.out.println("Student ID: " + l_varUserId);
        System.out.println("Student Program: " + l_varUserProgram);
        System.out.println("Student Enrollment Year: " + l_varUserEnrollmentYear);
        System.out.println("Student Average grade: " + l_varUserAverageScore);
    }
}
