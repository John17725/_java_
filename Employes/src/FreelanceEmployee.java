public class FreelanceEmployee extends Employee{
    private int projects;
    private double payPerProject;

    public FreelanceEmployee(String name, int projects, double payPerProject){
        super(name, 0);
        this.projects = projects;
        this.payPerProject = payPerProject;
    }

    @Override
    public double calculateSalary(){
        return projects*payPerProject;
    }

    @Override
    public String showInfoEmployee() {
        return "Employee Name: " + name+"- Salary: " + calculateSalary();
    }
}
