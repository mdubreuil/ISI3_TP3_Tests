
package persons;

import org.junit.*;
import people.SimplePerson;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */

public class TestSimplePerson extends TestPerson {
    
    @Before
    @Override
    public void setUp() {
        p1 = new SimplePerson ("DUBREUIL", "Mélanie", 1995, 3, 21);
        p2 = new SimplePerson ("DUBREUIL-LHOPITAL", "Richard", 2022, 8, 19);
        p3 = new SimplePerson ("DOE", "John", 2017, 4, 25);
        p4 = new SimplePerson ("DOE", "Jane", 2005, 4, 25);
        p5 = new SimplePerson ("LHOPITAL", "Sacha", 2016, 4, 26); 
    }

}
