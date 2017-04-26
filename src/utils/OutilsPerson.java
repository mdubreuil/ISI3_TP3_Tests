package utils;



import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import persons.IPerson;

/**
 *
 * @author Mélanie DUBREUIL - POLYTECH LYON - 4APP
 */
public class OutilsPerson {
    
    public static List<IPerson>  getPersonsInRangeAge (List<IPerson> persons,GregorianCalendar date, int ageMin, int ageMax){
       
       if (ageMin >= ageMax) {
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
       }
       
       List<IPerson> personsInRange = new ArrayList<>();
       
       for (IPerson i : persons){
           if(ageMin <= i.getAge(date) && i.getAge(date) <= ageMax){
               personsInRange.add(i);
           }
       }
       
       return personsInRange;
    }
    
    public static int getOldest (List<IPerson> persons,GregorianCalendar date){
       int oldest = 0;
       
       if(persons.isEmpty()){
          oldest = -1;
       } else {
            for (IPerson i : persons){
                if(i.getAge(date) > oldest){
                    oldest = i.getAge(date);
                }
            }
       }

       return oldest;
    }
    
}
