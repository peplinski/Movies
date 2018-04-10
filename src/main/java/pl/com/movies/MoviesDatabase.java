package pl.com.movies;

import java.time.LocalDate;
import java.util.*;

public class MoviesDatabase {

    Map<String, Movie> movieHashMap = new HashMap<>();

    public void addMovie(String tytulFilmu, MovieType movieType, LocalDate data, String rezyser) {
        Movie film=new Movie(tytulFilmu, movieType, data, rezyser);
        movieHashMap.put(tytulFilmu,film);
    }

    public void wyszukajFilm(String tytul) {
        Movie film = movieHashMap.get(tytul);
        System.out.println("Film: "+film);
    }
}






/*
* 1. Stwórz klasę MoviesDatabase która posiada:
    - jako pole posiada mapę filmów. Mapa powinna mapować z wartości typu String (będzie to nazwa filmu)
     na model (na obiekty klasy Movie)
    - stwórz metodę dodawania do bazy danych filmów ( addMovie(Movie m)) która dodaje do mapy film

    - stwórz metodę wyszukiwania filmów z bazy danych, która przyjmuje jako parametr nazwę filmu,
     a zwraca film który jest w bazie danych pod tą nazwą.

    - stwórz metodę wypisywania wszystkich filmów. Metoda powinna iterować po
    wartościach mapy i wypisywać informacje o filmie (nadpisz metodę toString w klasie ...[wiesz jakiej?]).
     metoda printAllMovies().

    - stwórz metodę o tej samej nazwie co powyższa, która przyjmuje jako parametr typ filmu (MovieType) i również iteruje wartości, jedak wypisuje tylko te filmy których MovieType odpowiada temu podanemu jako parametr.
2. Stwórz maina w którym będziesz testować tą funkcjonalność dodawania/wyszukiwania/wypisywania i filtrowania (wypisywanie tylko tych z wybranej kategorii) filmów.*/