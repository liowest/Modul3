import java.time.LocalDate;
import java.util.Date;

public class Medium {
    private Urheber urheber;
    private String title;
    private Genre genre;
    private LocalDate erscheinungsdatum;
    private String kommentar;

    public Medium(String title, Genre genre, LocalDate erscheinungsdatum, String kommentar, Urheber urheber ) {
        setGenre(genre);
        setTitle(title);
        setErscheinungsdatum(erscheinungsdatum);
        setKommentar(kommentar);
        setUrheber(urheber);
    }
    public void anzeigen(){
        System.out.println(title+genre.toString()+urheber.toString()+erscheinungsdatum+kommentar);
    }



    @Override
    public String toString() {
        return "Medium{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", erscheinungsdatum=" + erscheinungsdatum +
                ", kommentar='" + kommentar + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(LocalDate erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }
}
