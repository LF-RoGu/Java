import java.util.logging.Level;

public class Participants
{

    private String l_varUserName;
    private String l_varUserSurname;
    private String l_varUserAge;
    private String l_varUserTypeOfSport;
    private String l_varUserListOfAwards;



    /*
    Java Getters for private information
     */
    public String get_varUserName() {
        return l_varUserName;
    }

    public String get_varUserSurname() {
        return l_varUserSurname;
    }

    public String get_varUserAge() {
        return l_varUserAge;
    }

    public String get_varUserTypeOfSport() {
        return l_varUserTypeOfSport;
    }

    public String get_varUserListOfAwards() {
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

    public void set_varUserAge(String l_varUserAge) {
        this.l_varUserAge = l_varUserAge;
    }

    public void set_varUserTypeOfSport(String l_varUserTypeOfSport) {
        this.l_varUserTypeOfSport = l_varUserTypeOfSport;
    }

    public void set_varUserListOfAwards(String l_varUserListOfAwards) {
        this.l_varUserListOfAwards = l_varUserListOfAwards;
    }

}
