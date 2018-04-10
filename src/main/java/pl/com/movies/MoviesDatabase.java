package pl.com.movies;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MoviesDatabase {

    Map<String, Movie> movieHashMap = new HashMap<>();

    public void addMovie(String tytulFilmu, MovieType movieType, LocalDate data, String rezyser) {
        Movie film = new Movie(tytulFilmu, movieType, data, rezyser);
        movieHashMap.put(tytulFilmu, film);
    }

    public Optional<Movie> wyszukajFilm(String nazwaFilmu) {
        Movie film = movieHashMap.get(nazwaFilmu);
        // jeśli zastosujemy Optional.of, to rzuci nam NullPointerException jeśli nie znajdzie elementu
        return Optional.ofNullable(film);
    }

    public void printAllMovie() {
        for (Movie f : movieHashMap.values()) {
            System.out.println(f);
        }
    }

    public List<Movie> znajdzFilmyTypu(MovieType typ) {
//        List<Movie> filmy = new ArrayList<>();
//
//        for (Movie film : filmy.values()) {
//            if(film.getType() == typ){
//                filmy.add(film);
//            }
//        }
//        return filmy;
        return movieHashMap.values().stream()
                .filter(film -> film.getMovieType() == typ)
                .collect(Collectors.toList());
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