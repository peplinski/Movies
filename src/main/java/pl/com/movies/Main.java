package pl.com.movies;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Movie avengers = new Movie("Avengers",MovieType.ACTION,LocalDate.of(2018,04,26),"Anthony Russo");
        Movie zyczenieSmierci = new Movie("Życzenie śmierci",MovieType.ACTION,LocalDate.of(2018,04,13),"Eli Roth");
        Movie zaKilkaDilerowWiecej = new Movie("Za kilka dolarów wiecej",MovieType.ACTION,LocalDate.of(1965,12,18),"Sergio Leone");
        Movie wiecznyStudent = new Movie("WIeczny Student",MovieType.COMEDY,LocalDate.of(2002,10,4),"Walt Becker");
        Movie howHigh = new Movie("How High",MovieType.COMEDY,LocalDate.of(2001,12,17),"Jesse Dylan");

        MoviesDatabase moviesDatabase = new MoviesDatabase();

        moviesDatabase.addMovie(avengers);
        moviesDatabase.addMovie(zyczenieSmierci);
        moviesDatabase.addMovie(zaKilkaDilerowWiecej);
        moviesDatabase.addMovie(wiecznyStudent);
        moviesDatabase.addMovie(howHigh);
    }
}
