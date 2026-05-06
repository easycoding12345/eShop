package entities;

public class Artikel {
    private int artikelID;
    private String bezeichnung;
    private int bestand;
    private int price;

    public Artikel(int artikelNummer, String bezeichnung, int bestand, int price) {
        this.artikelID = artikelNummer;
        this.bezeichnung = bezeichnung;
        this.bestand = bestand;
        this.price = price;
    }

    public String toString() {
        return ("Artikel Nr: " + artikelID + " / Bezeichnung: " + bezeichnung + " / " + "Bestand: " + bestand + " / " + price + " /");
    }

    public int getArtikelID() {
        return artikelID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getBestand() {
        return bestand;
    }

    public int getPrice() {
        return price;
    }

    public void bestandErhoehen() {
        this.bestand += 1;
    }

    public void bestandVerringern() {
        if (bestand > 0)
            this.bestand -= 1;
    }
}