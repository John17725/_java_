public class ContractEmployee extends Employee {
    private int hoursWorked;
    private double payPerHour;

    public ContractEmployee(String name, double payPerHour, int hoursWorked) {
        super(name,0);
        this.payPerHour = payPerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return payPerHour*hoursWorked;
    }

    @Override
    public String showInfoEmployee() {
        return "Employee Name: " + name+"- Salary: " + calculateSalary();
    }
}
