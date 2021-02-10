package staff;

public abstract class Employee {

    private String name;
    private String NiNumber;
    private double salary;

    public Employee(String name, String NiNumber, int salary){
        this.name = name;
        this.NiNumber = NiNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.NiNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double newSalary){
        this.salary = newSalary;
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
