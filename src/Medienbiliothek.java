import java.util.ArrayList;

public class Medienbiliothek {
    private ArrayList<Medium> medien;

    public void durchlaufen(){
       for(Medium medium : medien){
           medium.anzeigen();
       }
    }

    public void medienhinzufügen(Medium medium) {
        medien.add(medium);

    }
}
