package persons;

import org.junit.Before;
import people.OneMorePerson;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */
public class TestOneMorePerson extends TestPerson {
    @Before
    @Override
    public void setUp() {
        p1 = new OneMorePerson ("DUBREUIL", "Mélanie", 1995, 3, 21);
        p2 = new OneMorePerson ("DUBREUIL-LHOPITAL", "Richard", 2022, 8, 19);
        p3 = new OneMorePerson ("DOE", "John", 2017, 4, 25);
        p4 = new OneMorePerson ("DOE", "Jane", 2005, 4, 25);
        p5 = new OneMorePerson ("LHOPITAL", "Sacha", 2016, 4, 26); 
    }
}
