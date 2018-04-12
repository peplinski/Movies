package pl.com.koszykZakupow;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {
    List<Produkt> listaProduktow = new ArrayList<>();

    public Rachunek(List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void wypiszRachunek() {
        listaProduktow.forEach(System.out::println);
    }

    public double podsumujRachunekNetto() {
        double suma = listaProduktow.stream().mapToDouble(p -> p.getCenaProduktu()).sum();
        return suma;

//        for (Produkt produkt : listaProduktow) {
//            suma += produkt.getCenaProduktu();
//        }
    }

    public double podsumujRachunekBrutto() {
        return podsumujRachunekBrutto()- podsumujRachunekNetto();
    }

    public void porownajPodatki() {
        double na8Procent = podsumujRachunekNetto() +
                (podsumujRachunekNetto() * PodatekProduktu.VAT8.getProcentPodatku() / 100.0);
        double na23Procent = podsumujRachunekNetto() +
                (podsumujRachunekNetto() * PodatekProduktu.VAT23.getProcentPodatku() / 100.0);

        System.out.println("Wartość rachunku z podatkiem 8% = " + na8Procent + " wartość z podatkiem 23% = " + na23Procent);
    }

}
