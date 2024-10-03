import java.util.Date;

public class Filme extends Medium {

    private int Spielzeit;
    private boolean UHD;
    private boolean HD;
    private String ressegeur;

    public Filme(String title, Genre genre, Date erscheinungsdatum, String kommentar, Urheber urheber, int spielzeit, boolean UHD, boolean HD, String ressegeur) {
        super(title, genre, erscheinungsdatum, kommentar, urheber);
       setSpielzeit(spielzeit);
        setUHD(UHD);
        setHD(HD);
        setRessegeur(ressegeur);

    }



    public String getRessegeur() {
        return ressegeur;
    }

    public void setRessegeur(String ressegeur) {
        this.ressegeur = ressegeur;
    }

    public boolean isHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }

    public boolean isUHD() {
        return UHD;
    }

    public void setUHD(boolean UHD) {
        this.UHD = UHD;
    }

    public int getSpielzeit() {
        return Spielzeit;
    }

    public void setSpielzeit(int spielzeit) {
        Spielzeit = spielzeit;
    }
}
