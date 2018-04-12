package pl.com.dziennikSzk;

public class Main {
    public static void main(String[] args) {

        DziennikSzkolny dziennikSzkolny = new DziennikSzkolny();

        dziennikSzkolny.dodajStudenta("Pawel","Gawel","1234");
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.MATEMATYKA,5.0);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.INFORMATYKA,2.3);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.INFORMATYKA,3.5);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.MATEMATYKA,1.8);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.MATEMATYKA,3.4);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234",Przedmioty.MATEMATYKA,5.0);

        dziennikSzkolny.wypiszSrednia("1234");

        //dziennikSzkolny.wypiszOceny("1234");

    }
}
