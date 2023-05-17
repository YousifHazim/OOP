public class PartTimeEmployee implements WagesInterface{

    private double ratePerHour;
    private int hoursWorked;

    public PartTimeEmployee(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return ratePerHour*hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("The Salary of Part time employee = "+calculateSalary());
    }


}
