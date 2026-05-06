
import domain.EShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EShopClientCUI {

    private EShop eShop;
    private BufferedReader in;

    public EShopClientCUI() throws IOException {

        eShop = new EShop();

        in = new BufferedReader(new InputStreamReader(System.in));
    }

    private void gibMenueAus() {
        System.out.print("Befehle: \n  Artikel liste:  'a'");
        System.out.print("\n  Artikel einzufuegen:  'ae'");
        System.out.print("\n  Artikel loeschen:  'al'");
        System.out.print("         \n  ---------------------");
        System.out.println("         \n  Beenden:        'q'");
        System.out.print("> "); // Prompt
        System.out.flush(); // ohne NL ausgeben
    }

    private String liesEingabe() throws IOException {
        // einlesen von Konsole
        return in.readLine();
    }

    private void verarbeiteEingabe(String line) throws IOException {
        String nummer;
        int nr;
        String bezeichnung;
        List artikelListe;

        // Eingabe bearbeiten:
        switch (line) {
            case "a" -> {
                artikelListe = eShop.gibAlleArtikel();
                gibArtikellisteAus(artikelListe);
            }

            case "ae" -> {
                // lies die notwendigen Parameter, einzeln pro Zeile
                System.out.print("Artikel > ");
                nummer = liesEingabe();
                nr = Integer.parseInt(nummer);
                System.out.print("Bezeichnung  > ");
                bezeichnung = liesEingabe();

                eShop.fuegeArtikelEin(nr, bezeichnung);
                System.out.println("Einfügen ok");

            }

            case "al" -> {
                System.out.println("Artikel Nr > ");
                nummer = liesEingabe();
                nr = Integer.parseInt(nummer);
                System.out.println("Bezeichnung > ");
                bezeichnung = liesEingabe();

                eShop.loescheArtikel(nr, bezeichnung);
            }
        }
    }

    private void gibArtikellisteAus(List liste) {
        if (liste.isEmpty()) {
            System.out.println("Liste ist leer.");
        } else {
            for (Object artikel: liste) {
                System.out.println(artikel.toString());
            }
        }
    }

    public void run() {
        // Variable für Eingaben von der Konsole
        String input = "";

        // Hauptschleife der Benutzungsschnittstelle
        do {
            gibMenueAus();
            try {
                input = liesEingabe();
                verarbeiteEingabe(input);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } while (!input.equals("q"));
    }

    public static void main(String[] args) {
        EShopClientCUI cui;
        try {
            cui = new EShopClientCUI();
            cui.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
