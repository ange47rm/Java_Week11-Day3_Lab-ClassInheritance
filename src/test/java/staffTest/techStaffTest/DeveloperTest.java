package staffTest.techStaffTest;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer ("Angelo", "B7F3G725", 30000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Angelo", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("B7F3G725", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void developerCanRaiseSalary(){
        developer.raiseSalary(35000.00);
        assertEquals(35000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void developerCanPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.00);
    }
}
