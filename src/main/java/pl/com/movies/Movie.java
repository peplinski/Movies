package pl.com.movies;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
    private String tytulFilmu;
    private MovieType movieType;
    private LocalDate data;
    private String rezyser;

    public Movie(String tytulFilmu, MovieType movieType, LocalDate data, String rezyser) {
        this.tytulFilmu = tytulFilmu;
        this.movieType = movieType;
        this.data = data;
        this.rezyser = rezyser;
    }

    public Movie() {
    }

    public String getTytulFilmu() {
        return tytulFilmu;
    }

    public void setTytulFilmu(String tytulFilmu) {
        this.tytulFilmu = tytulFilmu;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(tytulFilmu, movie.tytulFilmu);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tytulFilmu='" + tytulFilmu + '\'' +
                ", movieType=" + movieType +
                ", data=" + data +
                ", rezyser='" + rezyser + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytulFilmu);
    }
}