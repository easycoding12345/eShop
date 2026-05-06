package entities;

public class Kunde {
    private int kundeID;
    private String name;
    private String adresse;
    private String kundeUsername;
    private String kundePwd;


    public Kunde(int kundeID, String name, String adresse, String kundeUsername, String kundePwd) {
        this.kundeID = kundeID;
        this.name = name;
        this.adresse = adresse;
        this.kundeUsername = kundeUsername;
        this.kundePwd = kundePwd;
    }


    public int getNummer() {
        return kundeID;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getKundeUsername() {
        return kundeUsername;
    }

    public String getKundePwd() {
        return kundePwd;
    }

    public void setKundeID(int nummer) {
        this.kundeID = nummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setKundeUsername(String kundeUsername) {
        this.kundeUsername = kundeUsername;
    }

    public void setKundePwd(String kundePwd) {
        this.kundePwd = kundePwd;
    }

}