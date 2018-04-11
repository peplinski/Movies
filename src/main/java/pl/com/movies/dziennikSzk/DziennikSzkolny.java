package pl.com.movies.dziennikSzk;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DziennikSzkolny {
    private Map<String, DaneStudenta> mapaDanych = new HashMap<>();
    private Map<String, OcenyStudenta> mapaOcen = new HashMap<>();


    public void dodajStudenta(String imie, String nazwisko, String numerIndeksu) {
        DaneStudenta daneStudenta = new DaneStudenta(imie, nazwisko, numerIndeksu);

        if (mapaDanych.containsKey(numerIndeksu)) {
            System.out.println("Uwaga! Nadpisuję dane studenta");
        }
        mapaDanych.put(numerIndeksu, daneStudenta);
    }

    public void dodajOcenęDlaStudenta(String nrIndeksu, Przedmioty przedmioty, Double ocena) {
        OcenyStudenta ocenyStudenta = null;
        if (mapaOcen.containsKey(nrIndeksu)) {
            //to zanaczy ze juz sa oceny
            ocenyStudenta = mapaOcen.get(nrIndeksu);
        } else {
            //oznacza ze w mapie nie ma żadnych ocen
            ocenyStudenta = new OcenyStudenta();
        }
        ocenyStudenta.dodajOcene(przedmioty, ocena);
        mapaOcen.put(nrIndeksu, ocenyStudenta);
    }

    public void wypiszSrednia(String nrIndexu) {
        if (!mapaOcen.containsKey(nrIndexu)) {
            System.out.println("Nie posiadam żadnych ocen tego studenta!");
            return;
        }
        //wywolaj metodę wypiszOceny() z klasy OcenyStudenta
        mapaOcen.get(nrIndexu).wypiszSrednia();
    }

    public void wypiszOceny(String nrIndexu) {
        if (!mapaOcen.containsKey(nrIndexu)) {
            System.out.println("Nie posiadam żadnych ocen tego studenta!");
            return;
        }
        //wywolaj metodę wypiszOceny() z klasy OcenyStudenta
        mapaOcen.get(nrIndexu).wypiszOceny();

    }


}
