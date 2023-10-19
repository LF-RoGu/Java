package License;

import License.LicenseType.enumLicenseType;
import Person.PersonInfo;

public abstract class LicenseInfo extends PersonInfo
{
    protected int l_intLicenseID;

    public LicenseInfo(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, int l_intLicenseID) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality);
        this.l_intLicenseID = l_intLicenseID;
    }

    public int get_intLicenseID()
    {
        int l_returnValue = 0;
        if((this.l_intLicenseID != 0) | (this.l_intLicenseID < 0))
        {
            l_returnValue = l_intLicenseID;
        }
        else
        {
            System.out.println("Invalid License");
        }
        return l_returnValue;
    }

    public abstract void print_SystemLicenseInfo(LicenseInfo l_LicenseInfo);
}

class LicenseMotorist extends LicenseInfo
{
    private License.LicenseType.enumLicenseType l_enumLicenseType;

    public LicenseMotorist(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, int l_intLicenseID) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality, l_intLicenseID);
        this.l_enumLicenseType = enumLicenseType.Motorist;
    }

    @Override
    public void print_SystemLicenseInfo(LicenseInfo l_LicenseInfo)
    {
        System.out.println("License ID... " + l_LicenseInfo.get_intLicenseID());
        System.out.println("License Name... " + l_LicenseInfo.get_stringFirstName() + " " + l_LicenseInfo.get_stringLastName());
        System.out.println("License Age... " + l_LicenseInfo.get_intAge());
        System.out.println("License Type... " + this.l_enumLicenseType.toString());
    }
}

class LicenseDriver extends LicenseInfo
{
    private License.LicenseType.enumLicenseType l_enumLicenseType;

    public LicenseDriver(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, int l_intLicenseID) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality, l_intLicenseID);
        this.l_enumLicenseType = enumLicenseType.Driver;
    }

    @Override
    public void print_SystemLicenseInfo(LicenseInfo l_LicenseInfo)
    {
        System.out.println("License ID... " + l_LicenseInfo.get_intLicenseID());
        System.out.println("License Name... " + l_LicenseInfo.get_stringFirstName() + " " + l_LicenseInfo.get_stringLastName());
        System.out.println("License Age... " + l_LicenseInfo.get_intAge());
        System.out.println("License Type... " + this.l_enumLicenseType.toString());
    }
}

class LicenseChauffeur extends LicenseInfo
{
    private License.LicenseType.enumLicenseType l_enumLicenseType;

    public LicenseChauffeur(String l_stringFirstName, String l_stringLastName, int l_intAge, String l_stringNationality, int l_intLicenseID) {
        super(l_stringFirstName, l_stringLastName, l_intAge, l_stringNationality, l_intLicenseID);
        this.l_enumLicenseType = enumLicenseType.Chauffeur;
    }

    @Override
    public void print_SystemLicenseInfo(LicenseInfo l_LicenseInfo)
    {
        System.out.println("License ID... " + l_LicenseInfo.get_intLicenseID());
        System.out.println("License Name... " + l_LicenseInfo.get_stringFirstName() + " " + l_LicenseInfo.get_stringLastName());
        System.out.println("License Age... " + l_LicenseInfo.get_intAge());
        System.out.println("License Type... " + this.l_enumLicenseType.toString());
    }
}