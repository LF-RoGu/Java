public class Book
{
    private String l_stringAuthor;
    private String l_stringTitle;
    private int l_intNumPages;

    public Book() {
    }

    public Book(String l_stringAuthor, String l_stringTitle, int l_intNumPages) {
        this.l_stringAuthor = l_stringAuthor;
        this.l_stringTitle = l_stringTitle;
        this.l_intNumPages = l_intNumPages;
    }

    public String get_stringAuthor() {
        return l_stringAuthor;
    }

    public String get_stringTitle() {
        return l_stringTitle;
    }

    public int get_intNumPages() {
        return l_intNumPages;
    }

    public void set_stringAuthor(String l_stringAuthor) {
        this.l_stringAuthor = l_stringAuthor;
    }

    public void set_stringTitle(String l_stringTitle) {
        this.l_stringTitle = l_stringTitle;
    }

    public void set_intNumPages(int l_intNumPages) {
        this.l_intNumPages = l_intNumPages;
    }
}
