package Encapsulation;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numOfEmployees;  // Static member ,this belongs to the class not objects

    public Employee(int baseSalary,int hourlyRate){
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
        numOfEmployees++;
    }

    // Constructor overloading
    public Employee(int baseSalary){
        this(baseSalary,0); // this is calling the constructor with 2 parameter ,(above one)
    }

    public int calcWage(int extraHours ){
        return baseSalary + (hourlyRate * baseSalary);
    }

    // Method Overloading
    public int calcWage(){
       return calcWage(0);
    }

    // Static method
    public static void printNumberOfEmployee(){
        System.out.println(numOfEmployees);
        //static method can see only static members ( method and fields)  only
        // here we can't use baseSalary ,hourlyRate , calWage()

        // if we want to access it then we have to make a new Emplyess objects then only we are able to acces it
//       new Employee().calcWage();
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <0){
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}
