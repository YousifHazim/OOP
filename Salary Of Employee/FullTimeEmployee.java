public class FullTimeEmployee implements WagesInterface{

    private double salary;

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("The Salary of the full time emplyee = "+calculateSalary());
    }
}
