package staffTest.techStaffTest;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jonathan", "PB184456G", 22000.00);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Jonathan", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber() {
        assertEquals("PB184456G", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(22000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void databaseAdminCanRaiseSalary() {
        databaseAdmin.raiseSalary(25000.00);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void databaseAdminCanPayBonus() {
        assertEquals(220.00, databaseAdmin.payBonus(), 0.00);
    }
}
