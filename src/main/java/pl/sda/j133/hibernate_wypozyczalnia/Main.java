package pl.sda.j133.hibernate_wypozyczalnia;

import pl.sda.j133.hibernate_wypozyczalnia.database.DataAccessObject;
import pl.sda.j133.hibernate_wypozyczalnia.pl.sda.j133.hibernate_wypozyczalnia.model.Klient;
import pl.sda.j133.hibernate_wypozyczalnia.pl.sda.j133.hibernate_wypozyczalnia.model.Wypozyczenie;

public class Main {
    public static void main(String[] args) {


        new DataAccessObject<Klient>().findAll(Klient.class);
    }
}
