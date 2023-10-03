package Encapsulation;

public class Main {
    public static void main(String[] args) {

        System.out.println("Total number of Employees created : "+Employee.numOfEmployees);

        Employee employee = new Employee(5000,10);
        int wage = employee.calcWage(5);
        System.out.println("Total number of Employees created : "+Employee.numOfEmployees); // Calling staic member without any objects
        System.out.println(wage);

        Employee employee1 = new Employee(10_000_000);
        int wage1 = employee1.calcWage();
        System.out.println("Total number of Employees created : "+Employee.numOfEmployees);
        System.out.println(wage1);

    }
}
