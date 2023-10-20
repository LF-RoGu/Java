public class Actor
{
    private String l_stringName;
    private String l_stringSurname;

    public Actor() {
    }

    public Actor(String l_stringName, String l_stringSurname) {
        this.l_stringName = l_stringName;
        this.l_stringSurname = l_stringSurname;
    }

    public String get_stringName() {
        return l_stringName;
    }

    public String get_stringSurname() {
        return l_stringSurname;
    }

    public void set_stringName(String l_stringName) {
        this.l_stringName = l_stringName;
    }

    public void set_stringSurname(String l_stringSurname) {
        this.l_stringSurname = l_stringSurname;
    }
}
