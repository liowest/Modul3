import java.time.LocalDate;
import java.util.Date;

public class eBooks extends Medium{

    private String author;
    private String ISBN;
    private int seitenanzahl;
    private int auflage;

    public eBooks(String title, Genre genre, LocalDate erscheinungsdatum, String kommentar, Urheber urheber, String author, String ISBN, int seitenanzahl, int auflage) {
        super(title, genre, erscheinungsdatum, kommentar, urheber);
        setAuthor(author);
        setISBN(ISBN);
        setSeitenanzahl(seitenanzahl);
        setAuflage(auflage);

    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println(author+ISBN+seitenanzahl+auflage);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public int getAuflage() {
        return auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }
}
