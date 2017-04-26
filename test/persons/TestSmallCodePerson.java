
package persons;

import org.junit.Before;
import people.SmallCodePerson;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */

public class TestSmallCodePerson extends TestPerson {
    @Before
    @Override
    public void setUp() {
        p1 = new SmallCodePerson ("DUBREUIL", "Mélanie", 1995, 3, 21);
        p2 = new SmallCodePerson ("DUBREUIL-LHOPITAL", "Richard", 2022, 8, 19);
        p3 = new SmallCodePerson ("DOE", "John", 2017, 4, 25);
        p4 = new SmallCodePerson ("DOE", "Jane", 2005, 4, 25);
        p5 = new SmallCodePerson ("LHOPITAL", "Sacha", 2016, 4, 26); 
    }
}
