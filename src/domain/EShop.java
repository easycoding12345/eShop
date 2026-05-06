package domain;

import entities.Artikel;

import java.io.IOException;
import java.util.List;


public class EShop {
    // Präfix für Namen der Dateien, in der die Bibliotheksdaten gespeichert sind
    private String datei = "";

    private ArtikelVW artikelVW;

    // private KundenVerwaltung kundenVW;
    // hier weitere Verwaltungsklassen, z.B. für Autoren oder Angestellte


    public EShop() throws IOException {
        this.datei = datei;

        // Buchbestand aus Datei einlesen
        artikelVW = new ArtikelVW();
//        artikelVW.ladeDaten(datei+"_B.txt");

//		// Kundenkartei aus Datei einlesen
//		meineKunden = new KundenVerwaltung();
//		meineKunden.liesDaten(datei+"_K.txt");
//		meineKunden.schreibeDaten(datei+"_K.txt");
    }

    public List gibAlleArtikel() {
        return artikelVW.getArtikelBestand();
    }


    public Artikel fuegeArtikelEin(int nummer, String bezeichnung) {
        Artikel art = new Artikel(nummer, bezeichnung, 0);
        artikelVW.einfuegen(art);
        return art;
    }

    public void loescheArtikel(int nummer, String bezeichnung) {
        Artikel art = new Artikel(nummer, bezeichnung, 0);
        artikelVW.loeschen(art);
    }
}
