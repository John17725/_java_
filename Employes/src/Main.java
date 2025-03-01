import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Cantidad inical de emplados: "+employees.size());
        employees.add(new PlantEmployee("Erick Camarena",17000,200));
        System.out.println("Empleado de planta agregado: "+employees.size());
        System.out.println(employees.getFirst());
        employees.add(new ContractEmployee("Jorge Felipe",25,96));
        System.out.println("Empleado de contrato agregado: "+employees.size());
        System.out.println(employees.get(1));
        employees.add(new FreelanceEmployee("Benjamin",6,1200));
        System.out.println("Empleado de contrato agregado: "+employees.size());
        System.out.println(employees.get(2));


        System.out.println("==========================================================================");
        for(Employee currentEmployee: employees){
//            System.out.println("Name: "+currentEmployee.name+"\nSalary: "+currentEmployee.calculateSalary());
            System.out.println(currentEmployee.showInfoEmployee());
        }
    }
}