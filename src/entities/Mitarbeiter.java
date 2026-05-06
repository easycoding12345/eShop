package entities;

public class Mitarbeiter {
    private int mitarbeiterID;
    private String name;
    private String mitarbeiterUsername;
    private String mitarbeiterPwd;

    public Mitarbeiter(int mitarbeiterID, String name, String mitarbeiterUsername, String mitarbeiterPwd) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.mitarbeiterUsername = mitarbeiterUsername;
        this.mitarbeiterPwd = mitarbeiterPwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public void setMitarbeiterUsername(String mitarbeiterUsername) {
        this.mitarbeiterUsername = mitarbeiterUsername;
    }

    public void setMitarbeiterPwd(String mitarbeiterPwd) {
        this.mitarbeiterPwd = mitarbeiterPwd;
    }

    public String getName() {
        return name;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public String getMitarbeiterUsername() {
        return mitarbeiterUsername;
    }

    public String getMitarbeiterPwd() {
        return mitarbeiterPwd;
    }
}