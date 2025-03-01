/**
 * Clase abstracta
 * Esta clase no puede ser instanciada directamente
 * Debe ser extendida por otra clase para poderse instanciar
 */
abstract class Employee {
    protected String name;
    protected double baseSalary;

    /**
     * Constructor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Metodo abstracto
     * Cualquier clase que herede a Employee esta obigada a implementarla
     * @return
     */
    public abstract double calculateSalary();

    /**
     * Metodo generico o concreto
     * @return
     */
    public String showInfoEmployee() {
        return "Employee Name: " + name+"- Base Salary: " + baseSalary;
    }
}
