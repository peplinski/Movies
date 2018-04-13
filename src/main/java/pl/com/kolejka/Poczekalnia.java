package pl.com.kolejka;

import java.time.LocalTime;
import java.util.Optional;
import java.util.PriorityQueue;

public class Poczekalnia {
    private String nazwa;
    private PriorityQueue<Klient> kolejkaKlientow = new PriorityQueue();

    public Poczekalnia() {
    }

    public Poczekalnia(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajKlienta(String imie, boolean czyPriorytet){
       Klient klient = new Klient(imie, LocalTime.now(), czyPriorytet);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       kolejkaKlientow.add(klient);

   }




    public Optional<Klient> pobierzKlienta(){
        return Optional.ofNullable(kolejkaKlientow.peek());
   }
   public void wypiszKolejnoKlientów(){

       PriorityQueue<Klient>copy = new PriorityQueue<>();
           copy.addAll(kolejkaKlientow) ;
           while(!copy.isEmpty()){
               System.out.println(copy.poll());
           }
           System.out.println() ;
   }
}
/*
* https://stackoverflow.com/questions/26100977/how-to-sort-a-priorityqueue-with-bool-and-date-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
 */