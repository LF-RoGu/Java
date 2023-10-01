public class Movies
{
    private String l_strMovieTitle;
    private int l_intMovieLenght;

    public Movies(String l_strMovieTitle, int l_intMovieLenght) {
        this.l_strMovieTitle = l_strMovieTitle;
        this.l_intMovieLenght = l_intMovieLenght;
    }

    public void watchMovie()
    {
        /* Obtains the name of the CLASS */
        String l_strInstanceName = this.getClass().getSimpleName();

        System.out.println(l_strMovieTitle + " is a " + l_strInstanceName + " film that lasts " + l_intMovieLenght);
    }
}

class Adventure extends Movies
{
    public Adventure(String l_strMovieTitle, int l_intMovieLenght) {
        super(l_strMovieTitle, l_intMovieLenght);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Scary music",
                "Something bad happens");
    }
}

class Comedy extends Movies
{
    public Comedy(String l_strMovieTitle, int l_intMovieLenght) {
        super(l_strMovieTitle, l_intMovieLenght);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Scary music",
                "Something funny happens");
    }
}

class Romance extends Movies
{
    public Romance(String l_strMovieTitle, int l_intMovieLenght) {
        super(l_strMovieTitle, l_intMovieLenght);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Lovely music",
                "Kiss scene happens");
    }
}