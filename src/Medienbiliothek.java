import java.util.ArrayList;

public class Medienbiliothek {
    private ArrayList<Medium> medien;

    public void durchlaufen(){
       for(Medium medium : medien){
           medium.anzeigen();
       }
    }
public void bestimmtanzeigen(String titel){
    for(Medium medium : medien){
        if (medium.getTitle().equals(titel)){
            medium.anzeigen();
        }
    }
    System.out.println("Der titel ist nicht im der medienbibliothek");

}
    public void medienhinzufügen(Medium medium) {
        medien.add(medium);

    }
}
