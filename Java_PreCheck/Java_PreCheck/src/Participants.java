import java.util.logging.Level;

public class Participants
{

    enum e_typeOfSport
    {
        No_Sport,
        Football,
        Basketball,
        Volleyball,
        Swimming,
        Boxing, Cricket,
        Tennis,
        Padel,
        Golf
    }
    private String l_varUserName;
    private String l_varUserSurname;
    private int l_varUserAge;
    private e_typeOfSport l_varUserTypeOfSport;
    private int[] l_varUserListOfAwards;

    /*
    Java Getters for private information
     */
    public String get_varUserName() {
        return l_varUserName;
    }

    public String get_varUserSurname() {
        return l_varUserSurname;
    }

    public int get_varUserAge() {
        return l_varUserAge;
    }

    public e_typeOfSport get_varUserTypeOfSport() {
        return l_varUserTypeOfSport;
    }

    public int[] get_varUserListOfAwards() {
        return l_varUserListOfAwards;
    }

    /*
    Java Setters for private information
     */
    public void set_varUserName(String l_varUserName) {
        this.l_varUserName = l_varUserName;
    }

    public void set_varUserSurname(String l_varUserSurname) {
        this.l_varUserSurname = l_varUserSurname;
    }

    public void set_varUserAge(int l_varUserAge) {
        this.l_varUserAge = l_varUserAge;
    }

    public void set_varUserTypeOfSport(e_typeOfSport l_varUserTypeOfSport) {
        this.l_varUserTypeOfSport = l_varUserTypeOfSport;
    }

    public void set_varUserListOfAwards(int[] l_varUserListOfAwards) {
        this.l_varUserListOfAwards = l_varUserListOfAwards;
    }

}
