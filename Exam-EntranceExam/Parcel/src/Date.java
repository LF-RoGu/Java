public class Date
{
    private int l_intDate, l_intMonth, l_intYear;

    public Date() {
    }

    public Date(int l_intDate, int l_intMonth, int l_intYear) {
        this.l_intDate = l_intDate;
        this.l_intMonth = l_intMonth;
        this.l_intYear = l_intYear;
    }

    public int get_intDate() {
        return l_intDate;
    }

    public int get_intMonth() {
        return l_intMonth;
    }

    public int get_intYear() {
        return l_intYear;
    }

    public void set_intDate(int l_intDate) {
        this.l_intDate = l_intDate;
    }

    public void set_intMonth(int l_intMonth) {
        this.l_intMonth = l_intMonth;
    }

    public void set_intYear(int l_intYear) {
        this.l_intYear = l_intYear;
    }
}
