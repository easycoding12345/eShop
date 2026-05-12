package domain;
import entities.Benutzer;

import java.util.HashMap;
import java.util.Map;
public class BenutzerVW {
    private Map<String, Benutzer> benutzerMap = new HashMap<>();
    private Benutzer aktuellerBenutzer;

    public void registrieren(Benutzer benutzer){
        if (benutzerMap.containsKey(benutzer.getBenutzerErkennung())){
            throw new IllegalArgumentException("Benutzer existiert bereit!");
        }
        benutzerMap.put(benutzer.getBenutzerErkennung(), benutzer);
        System.out.println("Registrierung erfolgreich");
    }

    public Benutzer login(String benutzerErkennung, String benutzerPassword){
       Benutzer benutzer = benutzerMap.get(benutzerErkennung);
        if (benutzer != null && benutzer.checkPassword(benutzerPassword)) {
            aktuellerBenutzer = benutzer;
            System.out.println("Login erfolgreich.");
            return aktuellerBenutzer;
        }

        System.out.println("Falscher Benutzername oder Password.");
        return null;
    }


    public void logout(){
        if(aktuellerBenutzer != null){
            System.out.println(aktuellerBenutzer.getBenutzerVorNachname() + "wurde ausgelogt.");
            aktuellerBenutzer = null;
        }else{
            System.out.println("keine Benutzer eingelogt.");
        }
    }
    public void kontoErstellen(){
        if (aktuellerBenutzer !=null){
            System.out.println("konto für " + aktuellerBenutzer.getBenutzerVorNachname()
                    + "wurde erstellt.");
        }else{
            System.out.println("Bitte zuerst einloggen");
        }
    }
    public Benutzer getAktuellerBenutzer(){
        return aktuellerBenutzer;
    }
    public boolean istEingeloggt(){
        return aktuellerBenutzer !=null;
    }

    public boolean istMitarbeiter(){
        return aktuellerBenutzer != null &&
                aktuellerBenutzer.getRole().equals("Mitarbeiter");
    }
    public boolean istKunde(){
        return aktuellerBenutzer !=null &&
                aktuellerBenutzer.getRole().equals("Kunde");
    }
}