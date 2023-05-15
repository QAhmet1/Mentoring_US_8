package week9._1_monday.example2;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1=new Movie("casinio Royale","Eon","PG_13");
        Movie m2=new Movie("Titanic","Marvel");
        Movie[] movies={m1,m2};
        m1.getMovies(movies);
    }
}
