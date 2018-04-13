package pl.com.kolejka;

import java.time.LocalTime;

public class Klient implements Comparable<Klient> {
    private String imieKlienta; //(wyłącznie dla celów prezentacji - żeby później łatwiej nam było czytać poprawność wyników)
    private LocalTime czasPrzybycia;
    private boolean czyJestPriorytetem;// (tak lub nie)

    public Klient(String imieKlienta, LocalTime czasPrzybycia, boolean czyJestPriorytetem) {
        this.imieKlienta = imieKlienta;
        this.czasPrzybycia = LocalTime.now();
        this.czyJestPriorytetem = czyJestPriorytetem;
    }

    public String getImieKlienta() {
        return imieKlienta;
    }

    public void setImieKlienta(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    public LocalTime getCzasPrzybycia() {
        return czasPrzybycia;
    }

    public void setCzasPrzybycia(LocalTime czasPrzybycia) {
        this.czasPrzybycia = czasPrzybycia;
    }

    public boolean getCzyJestPriorytetem() {
        return czyJestPriorytetem;
    }

    public void setCzyJestPriorytetem(boolean czyJestPriorytetem) {
        this.czyJestPriorytetem = czyJestPriorytetem;
    }

    @Override
    public int compareTo(Klient o) {
        if (czyJestPriorytetem && !o.czyJestPriorytetem) {
            return -1;
        } else if (!czyJestPriorytetem && o.czyJestPriorytetem) {
            return 1;
        }

        if (czasPrzybycia.isBefore(o.czasPrzybycia)) {
            return -1;
        } else if (czasPrzybycia.isAfter(o.czasPrzybycia)) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imieKlienta='" + imieKlienta + '\'' +
                ", czasPrzybycia=" + czasPrzybycia +
                ", czyJestPriorytetem=" + czyJestPriorytetem +
                '}';
    }
}


