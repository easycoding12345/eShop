package domain;

import entities.Artikel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//import bib.local.domain.exceptions.BuchExistiertBereitsException;
//import bib.local.persistence.FilePersistenceManager;
//import bib.local.persistence.PersistenceManager;
//import bib.local.entities.Buch;
//import bib.local.entities.BuchListe;


/**
 * Klasse zur Verwaltung von Büchern.
 *
 * @author teschke
 * @version 1 (Verwaltung in verketteter Liste)
 */
public class ArtikelVW {
    private HashMap<Integer, Artikel> artikelBestand = new HashMap<>();


    public void einfuegen(Artikel einArtikel) {
        if (artikelBestand.containsKey(einArtikel.getArtikelID())) {
            einArtikel.bestandErhoehen();
        } else {
            artikelBestand.add(einArtikel);
            artikelBestand.get(artikelBestand.indexOf(einArtikel)).bestandErhoehen();
        }
    }

    public void loeschen(Artikel einArtikel) {
        artikelBestand.get(artikelBestand.indexOf(einArtikel)).bestandVerringern();
    }

    public List getArtikelBestand() {
        return new ArrayList(artikelBestand);
    }
}
