public class SalariedEmployee extends Employee implements calculatePay{
    private String SocialSecurityNumber;
    int salary = 25000;
    public SalariedEmployee(int employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.SocialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        SocialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        if ( salary< 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        return salary;
    }
}
