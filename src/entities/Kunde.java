package entities;

public class Kunde extends Benutzer {
    public Kunde(String benutzerErkennung, String benutzerVorNachname, String benutzerPassword){
        super(benutzerErkennung, benutzerVorNachname, benutzerPassword);
    }

    @Override
    public String getRole() {
        return "Kunde";
    }
}