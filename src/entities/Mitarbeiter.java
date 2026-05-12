package entities;

public class Mitarbeiter extends Benutzer{
    public Mitarbeiter(String benutzerErkennung, String benutzerVorNachname, String benutzerPassword){
        super(benutzerErkennung, benutzerVorNachname, benutzerPassword);
    }

    @Override
    public String getRole() {
        return "Mitarbeiter";
    }
}