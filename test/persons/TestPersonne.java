package persons;

import org.junit.Before;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */

public class TestPersonne extends TestPerson {
    @Before
    @Override
    public void setUp() {
        p1 = new AdapteurPersonne ("DUBREUIL", "Mélanie", 1995, 3, 21);
        p2 = new AdapteurPersonne ("DUBREUIL-LHOPITAL", "Richard", 2022, 8, 19);
        p3 = new AdapteurPersonne ("DOE", "John", 2017, 4, 25);
        p4 = new AdapteurPersonne ("DOE", "Jane", 2005, 4, 25);
        p5 = new AdapteurPersonne ("LHOPITAL", "Sacha", 2016, 4, 26); 
    }
}
