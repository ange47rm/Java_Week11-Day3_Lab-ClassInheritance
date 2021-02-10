package staffTest.managementTest;

import org.junit.Before;
import org.junit.Test;

import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Hannah", "6893GBF69D", 80000.00, "Warranty", 250000.00);
    }

    @Test
    public void directorHasName() {
        assertEquals("Hannah", director.getName());
    }

    @Test
    public void directorHasNiNumber() {
        assertEquals("6893GBF69D", director.getNiNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(80000.00, director.getSalary(), 0.00);
    }

    @Test
    public void directorHasDeptName() {
        assertEquals("Warranty", director.getDeptName());
    }

    @Test
    public void directorCanRaiseSalary() {
        director.raiseSalary(85000.00);
        assertEquals(85000.00, director.getSalary(), 0.00);
    }

    @Test
    public void directorCanPayBonus() {
        assertEquals(800.00, director.payBonus(), 0.00);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(250000.00, director.getBudget(), 0.00);
    }

    @Test
    public void preventSlavery(){
        director.raiseSalary(-80000.00);
        assertEquals(80000.00, director.getSalary(), 0.00);
    }
}