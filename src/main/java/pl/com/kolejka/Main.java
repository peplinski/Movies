package pl.com.kolejka;

import java.util.Optional;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Poczekalnia poczekalnia = new Poczekalnia("Kolejka");
        poczekalnia.dodajKlienta("a",true);
        poczekalnia.dodajKlienta("b",false);
        poczekalnia.dodajKlienta("c",true);
        poczekalnia.dodajKlienta("d",false);
        poczekalnia.dodajKlienta("e",true);
        poczekalnia.dodajKlienta("f",true);
        poczekalnia.dodajKlienta("g",true);

        Optional<Klient> k =poczekalnia.pobierzKlienta();
        if (k.isPresent()){
            System.out.println(k.get());
        }

        poczekalnia.wypiszKolejnoKlientów();
    }
}
