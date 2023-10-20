public class Address
{
    private String l_stringCountry, l_stringCity, l_stringStreet;
    private int l_intIndex;

    boolean l_boolHouseOrFlat;

    public Address() {
    }

    public Address(String l_stringCountry, String l_stringCity, String l_stringStreet, int l_intIndex, boolean l_boolHouseOrFlat) {
        this.l_stringCountry = l_stringCountry;
        this.l_stringCity = l_stringCity;
        this.l_stringStreet = l_stringStreet;
        this.l_intIndex = l_intIndex;
        this.l_boolHouseOrFlat = l_boolHouseOrFlat;
    }

    public String get_stringCountry() {
        return l_stringCountry;
    }

    public String get_stringCity() {
        return l_stringCity;
    }

    public String get_stringStreet() {
        return l_stringStreet;
    }

    public int get_intIndex() {
        return l_intIndex;
    }

    public boolean get_boolHouseOrFlat() {
        return l_boolHouseOrFlat;
    }

    public void set_stringCountry(String l_stringCountry) {
        this.l_stringCountry = l_stringCountry;
    }

    public void set_stringCity(String l_stringCity) {
        this.l_stringCity = l_stringCity;
    }

    public void set_stringStreet(String l_stringStreet) {
        this.l_stringStreet = l_stringStreet;
    }

    public void set_intIndex(int l_intIndex) {
        this.l_intIndex = l_intIndex;
    }


    public void set_boolHouseOrFlat(boolean l_boolHouseOrFlat) {
        this.l_boolHouseOrFlat = l_boolHouseOrFlat;
    }

    public void get_stringAddress()
    {
        System.out.println("Country... " + this.l_stringCountry);
        System.out.println("City... " + this.l_stringCity);
        System.out.println("Street... " + this.l_stringStreet);
        System.out.println("Index... " + Integer.toString(this.l_intIndex));
        System.out.printf("The address is in a... ");
        if(this.l_boolHouseOrFlat)
        {
            System.out.println("House");
        }
        else
        {
            System.out.println("Flat");
        }
    }
}
