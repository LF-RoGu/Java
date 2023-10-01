public class Main {
    public static void main(String[] args)
    {
        /* Class type Movies calling super class Movies */
        Movies l_classMovie = new Movies("Star Wars", 210);
        l_classMovie.watchMovie();
        /* Class type Movies calling sub class Adventure */
        Movies l_classMovieAdventure = new Adventure("Star Wars", 210);
        l_classMovieAdventure.watchMovie();

        /* Class type Movies calling sub class Adventure */
        Movies l_classMovieComedy = new Comedy("Star Wars", 210);
        l_classMovieComedy.watchMovie();

        /* Class type Movies calling sub class Adventure */
        Movies l_classMovieRomance = new Romance("Star Wars", 210);
        l_classMovieRomance.watchMovie();
    }
}