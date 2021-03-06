package staff.management;

import staff.management.Manager;

public class Director extends Manager{

    private double budget;

    public Director(String name, String NiNumber, double salary, String deptName, double budget){
        super(name, NiNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){
        return getSalary() * 0.02;
    }
}
