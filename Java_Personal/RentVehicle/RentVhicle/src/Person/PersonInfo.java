package Person;

import License.LicenseInfo;
import Person.StorePersonal.Clerk;
import Person.StorePersonal.Manager;

public class PersonInfo
{
    protected String l_stringFirstName;
    protected String l_stringLastName;
    protected int l_intAge;
    protected String l_stringNationality;

    public PersonInfo(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality) {
        this.l_stringFirstName = l_stringFirstName;
        this.l_stringLastName = l_stringLastName;
        this.l_intAge = l_intAge;
        this.l_stringNationality = l_stringNationality;
    }

    public String get_stringFirstName() {
        return l_stringFirstName;
    }

    public String get_stringLastName() {
        return l_stringLastName;
    }

    public int get_intAge() {
        return l_intAge;
    }

    public String get_stringNationality() {
        return l_stringNationality;
    }

    public void set_stringFirstName(String l_stringFirstName) {
        this.l_stringFirstName = l_stringFirstName;
    }

    public void set_stringLastName(String l_stringLastName) {
        this.l_stringLastName = l_stringLastName;
    }

    public void set_intAge(int l_intAge) {
        this.l_intAge = l_intAge;
    }

    public void set_stringNationality(String l_stringNationality) {
        this.l_stringNationality = l_stringNationality;
    }
}

class StorePersonalInfo extends  PersonInfo implements Manager, Clerk
{
    private int l_intEmployeeId;
    private double l_doubleEmployeeSalary;

    public StorePersonalInfo(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, int l_intEmployeeId, double l_doubleEmployeeSalary) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality);
        this.l_intEmployeeId = l_intEmployeeId;
        this.l_doubleEmployeeSalary = l_doubleEmployeeSalary;
    }

    public int get_intEmployeeId() {
        return l_intEmployeeId;
    }

    public double get_doubleEmployeeSalary() {
        return l_doubleEmployeeSalary;
    }

    public void set_intEmployeeId(int l_intEmployeeId) {
        this.l_intEmployeeId = l_intEmployeeId;
    }

    public void set_doubleEmployeeSalary(double l_doubleEmployeeSalary) {
        this.l_doubleEmployeeSalary = l_doubleEmployeeSalary;
    }

    @Override
    public void Clerk()
    {

    }
    @Override
    public void Manager()
    {

    }
}

class ClientInfo extends PersonInfo
{
    private String l_stringEmail;
    private int l_intPhoneNumber;

    public ClientInfo(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, String l_stringEmail, int l_intPhoneNumber) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality);
        this.l_stringEmail = l_stringEmail;
        this.l_intPhoneNumber = l_intPhoneNumber;
    }

    public String get_stringEmail() {
        return l_stringEmail;
    }

    public int get_intPhoneNumber() {
        return l_intPhoneNumber;
    }

    public void set_stringEmail(String l_stringEmail) {
        this.l_stringEmail = l_stringEmail;
    }

    public void set_intPhoneNumber(int l_intPhoneNumber) {
        this.l_intPhoneNumber = l_intPhoneNumber;
    }
}



