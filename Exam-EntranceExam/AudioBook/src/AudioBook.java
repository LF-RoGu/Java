public class AudioBook
{
    private Actor l_classActor = new Actor();
    private Book l_classBook = new Book();
    private int l_intDurationMinutes;

    public AudioBook() {
    }

    public AudioBook(Actor l_classActor, Book l_classBook, int l_intDurationMinutes) {
        this.l_classActor = l_classActor;
        this.l_classBook = l_classBook;
        this.l_intDurationMinutes = l_intDurationMinutes;
    }

    public Actor get_classActor() {
        return this.l_classActor;
    }

    public Book get_classBook() {
        return this.l_classBook;
    }

    public int get_intDurationMinutes() {
        return l_intDurationMinutes;
    }

    public void set_classActor(Actor l_classActor) {
        this.l_classActor = l_classActor;
    }

    public void set_classBook(Book l_classBook) {
        this.l_classBook = l_classBook;
    }

    public void set_intDurationMinutes(int l_intDurationMinutes) {
        this.l_intDurationMinutes = l_intDurationMinutes;
    }
}
