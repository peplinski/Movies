package pl.com.movies.dziennikSzk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OcenyStudenta {
    private Map<Przedmioty, List<Double>> ocenyStudenta = new HashMap<>();

    public OcenyStudenta() {
    }

    public Map<Przedmioty, List<Double>> getOcenyStudenta() {
        return ocenyStudenta;
    }

    public void setOcenyStudenta(Map<Przedmioty, List<Double>> ocenyStudenta) {
        this.ocenyStudenta = ocenyStudenta;
    }

    public void dodajOcene(Przedmioty przedmioty, Double ocena) {
        List<Double> listaOcen = null;
        if (ocenyStudenta.containsKey(przedmioty)) {
            //po podanym przedmiotem nie ma ocen
            listaOcen = ocenyStudenta.get(przedmioty);
            listaOcen.add(ocena);

        } else {
            listaOcen = new ArrayList<>();
        }
        listaOcen.add(ocena);
        ocenyStudenta.put(przedmioty, listaOcen);
    }
    public void wypiszOceny() {
        System.out.println("Oceny: ");
        for (Przedmioty przedmioty : Przedmioty.values()) {
            wypiszOceny(przedmioty);
        }
    }

    private void wypiszOceny(Przedmioty przedmioty) {
        if (ocenyStudenta.containsKey(przedmioty)) {
            System.out.println(przedmioty + " -> " + ocenyStudenta.get(przedmioty));
        }
    }

    public void wypiszSrednia() {
        System.out.println("Srednia z przedmiotow: ");

        double sumaSrednichZPrzedmiotow=0.0;
        int licznikSumowanychPrzedmiotow = 0;
        for (Przedmioty przedmioty : Przedmioty.values()) {
            double sredniaZPrzedmiotu = obliczSredniaZPrzedmiotu(przedmioty);
            if (sredniaZPrzedmiotu !=0.0){
                System.out.println("Srednia (" +przedmioty+" ): "+sredniaZPrzedmiotu);
                sumaSrednichZPrzedmiotow += sredniaZPrzedmiotu;
                licznikSumowanychPrzedmiotow++;
            }
        }
    }

    private double obliczSredniaZPrzedmiotu(Przedmioty przedmioty) {
        if (!ocenyStudenta.containsKey(przedmioty)){
          //brak ocen
          return 0;
        }
        //pobieram oceny
        List<Double> listaOcen = ocenyStudenta.get(przedmioty);
        //obliczam sume ocen(stram)
        double sumaOcenZPrzedmiotu = listaOcen.stream().mapToDouble(o ->o).sum();
        //dzile sume na ilosc(srednia)
        sumaOcenZPrzedmiotu/=listaOcen.size();
        return sumaOcenZPrzedmiotu;

    }
}
