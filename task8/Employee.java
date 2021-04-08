public class Employee {
    private int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
        if (this.employeeId < 0) {
            throw new IllegalArgumentException("EmployeeID cannot be negative");
        }

    }
    public Employee(){}

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int calculatePay(){
        return 0;

    }
}
