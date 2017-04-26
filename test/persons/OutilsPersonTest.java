package persons;
import java.util.Arrays;
import utils.OutilsPerson;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 * 
 */

public class OutilsPersonTest {
    protected IPerson mockPerson1, mockPerson2, mockPerson3, mockPerson4;
    protected GregorianCalendar date = new GregorianCalendar(2017,Calendar.APRIL,26);
    
    
    
    @Before
    public void setUp() {
        mockPerson1 = Mockito.mock(IPerson.class);
        mockPerson2 = Mockito.mock(IPerson.class);
        mockPerson3 = Mockito.mock(IPerson.class);
        mockPerson4 = Mockito.mock(IPerson.class);
        
        Mockito.when(mockPerson1.getAge(date)).thenReturn(20);
        Mockito.when(mockPerson2.getAge(date)).thenReturn(25);
        Mockito.when(mockPerson3.getAge(date)).thenReturn(30);
        Mockito.when(mockPerson4.getAge(date)).thenReturn(25);
    }
    
    @Test
    public void testGetPersonsInRangeAge(){
        assertEquals(3,OutilsPerson.getPersonsInRangeAge(Arrays.asList(mockPerson1, mockPerson2, mockPerson3), date, 20, 30).size());
        assertEquals(0,OutilsPerson.getPersonsInRangeAge(Arrays.asList(mockPerson1, mockPerson2, mockPerson3), date, 35, 40).size());
        assertEquals(1,OutilsPerson.getPersonsInRangeAge(Arrays.asList(mockPerson1, mockPerson2, mockPerson3), date, 20, 22).size());
    }
    
    @Test
    public void testOutilsNotNull(){
        OutilsPerson op = new OutilsPerson();
        assertNotNull(op);
    }
    
    @Test
    public void testGetOldest(){
        assertEquals(30,OutilsPerson.getOldest(Arrays.asList(mockPerson1, mockPerson2, mockPerson3), date));
        assertEquals(25,OutilsPerson.getOldest(Arrays.asList(mockPerson2,mockPerson4), date));
        assertEquals(-1,OutilsPerson.getOldest(Arrays.asList(), date));
        
        // Check if getAge method has been called at least one
        Mockito.verify(mockPerson1, atLeastOnce()).getAge(date);
        // Check if name and firstName are never read
        Mockito.verify(mockPerson1, never()).getName();
        Mockito.verify(mockPerson1, never()).getFirstName();
    }
    
    
    @Test(expected=IllegalArgumentException.class)
    public void testGetPersonsInRangeAgeException() {
        assertEquals(2,OutilsPerson.getPersonsInRangeAge(Arrays.asList(mockPerson1, mockPerson2, mockPerson3), date, 30, 20).size());
    }
    
}
