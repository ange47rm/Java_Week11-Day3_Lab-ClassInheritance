package staffTest.managementTest;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Sandy", "A43FG786", 45000.00, "Warranty");
    }

    @Test
    public void managerHasName() {
        assertEquals("Sandy", manager.getName());
    }

    @Test
    public void managerHasNiNumber() {
        assertEquals("A43FG786", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(45000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Warranty", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary() {
        manager.raiseSalary(50000.00);
        assertEquals(50000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void preventSlavery(){
        manager.raiseSalary(-45000.00);
        assertEquals(45000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void managerCanPayBonus() {
        assertEquals(450.00, manager.payBonus(), 0.00);
    }

    @Test
    public void nameCannotBeChangedToNull(){
        manager.setName(null);
        assertEquals("Sandy", manager.getName());
    }
}
