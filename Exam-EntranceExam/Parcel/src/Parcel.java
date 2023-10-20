public class Parcel
{
    private int l_intID;
    private Date l_classDateOfDeparture;
    private Date l_classDateOfArrival;
    private Address l_classAddressOfDeparture, l_classAddressOfArrival;

    public Parcel() {
    }

    public Parcel(int l_intID, Date l_classDateOfDeparture, Date l_classDateOfArrival, Address l_classAddressOfDeparture, Address l_classAddressOfArrival) {
        this.l_intID = l_intID;
        this.l_classDateOfDeparture = l_classDateOfDeparture;
        this.l_classDateOfArrival = l_classDateOfArrival;
        this.l_classAddressOfDeparture = l_classAddressOfDeparture;
        this.l_classAddressOfArrival = l_classAddressOfArrival;
    }

    public int get_intID() {
        return l_intID;
    }

    public Date get_classDateOfDeparture() {
        return l_classDateOfDeparture;
    }
    public Date get_classDateOfArrival() {
        return l_classDateOfArrival;
    }

    public Address get_classAddressOfDeparture() {
        return l_classAddressOfDeparture;
    }

    public Address get_classAddressOfArrival() {
        return l_classAddressOfArrival;
    }

    public void set_intID(int l_intID) {
        this.l_intID = l_intID;
    }

    public void set_classDateOfDeparture(Date l_classDateOfDeparture) {
        this.l_classDateOfDeparture = l_classDateOfDeparture;
    }
    public void set_classDateOfArrival(Date l_classDateOfArrival) {
        this.l_classDateOfArrival = l_classDateOfArrival;
    }

    public void set_classAddressOfDeparture(Address l_classAddressOfDeparture) {
        this.l_classAddressOfDeparture = l_classAddressOfDeparture;
    }

    public void set_classAddressOfArrival(Address l_classAddressOfArrival) {
        this.l_classAddressOfArrival = l_classAddressOfArrival;
    }
}
