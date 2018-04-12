package pl.com;

import pl.com.movies.MovieType;
import pl.com.movies.MoviesDatabase;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        MoviesDatabase moviesDatabase = new MoviesDatabase();

        moviesDatabase.addMovie("Avengers", MovieType.ACTION, LocalDate.of(2018, 04, 26), "AAA");
        moviesDatabase.addMovie("Życzenie śmierci", MovieType.ACTION, LocalDate.of(2018, 04, 13), "Eli Roth");
        moviesDatabase.addMovie("Za kilka dolarów wiecej", MovieType.ACTION, LocalDate.of(1965, 12, 18), "Sergio Leone");
        moviesDatabase.addMovie("Wieczny Student", MovieType.COMEDY, LocalDate.of(2002, 10, 4), "Walt Becker");
        moviesDatabase.addMovie("How High", MovieType.COMEDY, LocalDate.of(2001, 12, 17), "Jesse Dylan");

        //System.out.println(moviesDatabase.movieHashMap);

        //moviesDatabase.wyszukajFilm("How High");
        moviesDatabase.printAllMovie();


    }
}
