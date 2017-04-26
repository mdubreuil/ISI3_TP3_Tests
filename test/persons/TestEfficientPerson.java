package persons;

import org.junit.Before;
import people.EfficientPerson;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */
public class TestEfficientPerson extends TestPerson {
    
    @Before
    @Override
    public void setUp() {
        p1 = new EfficientPerson ("DUBREUIL", "Mélanie", 22);
        p2 = new EfficientPerson ("DUBREUIL-LHOPITAL", "Richard", -1);
        p3 = new EfficientPerson ("DOE", "John", 0);
        p4 = new EfficientPerson ("DOE", "Jane", 12);
        p5 = new EfficientPerson ("LHOPITAL", "Sacha", 0); 
    }
}
