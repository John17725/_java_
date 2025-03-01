public class PlantEmployee extends Employee {
    private double bonus;

    /**
     * Constructor
     */
    public  PlantEmployee(String name, double baseSalary,  double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary+bonus;
    }

    @Override
    public String showInfoEmployee() {
        return "Employee Name: " + name+"- Salary: " + calculateSalary();
    }
}
