import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
    Filme film1 = new Filme("Titanik",new Genre("Romantik"),LocalDate.of(1997,11,18),"Liebesfilm",new Urheber("Alexander","Falkner","westproductions"),195,false,true,"james camoren");
    eBooks eBook1= new eBooks("Tintenherz",new Genre("abenteuer"),LocalDate.of(2000,1,10),"Actionbuch kinder",new Urheber("Moritz","Köll","schlöglproductions"),"Aron plattner","1221312321-2131231",311,40);
    Medienbiliothek medienbiliothek= new Medienbiliothek();
    medienbiliothek.medienhinzufügen(film1);
    medienbiliothek.medienhinzufügen(eBook1);

    medienbiliothek.durchlaufen();



    }
}