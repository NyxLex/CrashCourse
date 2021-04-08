public class ContractEmployee extends Employee implements  calculatePay {
    private String FederalTaxIdMember;
    private int hour_rate;
    private int hours_worked;
    int salary = 0;
    public ContractEmployee(int employeeID,String FederalTaxId,int hour_rate,int hours_worked) {

        this.FederalTaxIdMember = FederalTaxId;
        this.hour_rate = hour_rate;
        this.hours_worked = hours_worked;
        salary =this.hour_rate * this.hours_worked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FederalTaxIdMember='" + FederalTaxIdMember + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getFederalTaxIdMember() {
        return FederalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        FederalTaxIdMember = federalTaxIdMember;
    }

    public int getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    @Override
    public int calculatePay() {
        if (this.hour_rate * this.hours_worked< 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        return this.hour_rate * this.hours_worked;
    }
}