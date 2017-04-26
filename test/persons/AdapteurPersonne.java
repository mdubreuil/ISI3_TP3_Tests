package persons;

import java.util.GregorianCalendar;
import people.Personne;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 */
public class AdapteurPersonne extends Personne implements IPerson {

    public AdapteurPersonne(String nom, String prenom, int annee, int mois, int jour) {
        super(nom, prenom, annee, mois, jour);
    }

    @Override
    public boolean wasBorn(GregorianCalendar gc) {
        boolean wasBorn = false;
        if(this.dateNaissance.before(gc) || this.dateNaissance.equals(gc)){
            wasBorn = true;
        }
        return wasBorn;
    }

}
