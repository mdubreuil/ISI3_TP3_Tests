package persons;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */

public class TestPerson {
    protected IPerson p1, p2 , p3, p4, p5;
    protected GregorianCalendar c = new GregorianCalendar(2017,Calendar.APRIL,25);
    
    @Before
    public void setUp() {
        p1 = new Person ("DUBREUIL", "Mélanie", 1995, 3, 21);
        p2 = new Person ("DUBREUIL-LHOPITAL", "Richard", 2022, 8, 19);
        p3 = new Person ("DOE", "John", 2017, 4, 25);
        p4 = new Person ("DOE", "Jane", 2005, 4, 25);
        p5 = new Person ("LHOPITAL", "Sacha", 2016, 4, 26);
    } 
    
    @Test
    public void testWasBorn() {
        assertTrue(p1.wasBorn(c));
        assertTrue(p3.wasBorn(c));
        assertTrue(p4.wasBorn(c));
        assertFalse(p2.wasBorn(c));
        assertTrue(p5.wasBorn(c));
    }
    
    @Test
    public void testGetAge(){        
        assertEquals(22,p1.getAge(c));
        assertEquals(0,p3.getAge(c));
        assertEquals(12,p4.getAge(c));
        assertEquals(0,p5.getAge(c));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testGetAgeException() {
        assertEquals(13,p2.getAge(c));
    }
    
}
