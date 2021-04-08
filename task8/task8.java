public class task8 {
    public static void main (String[] args ){
    Employee[] emp = new Employee[4];

    emp[0] = new SalariedEmployee(1,"123ABd");
    emp[1] = new SalariedEmployee(2,"21QWE");
    emp[2] = new ContractEmployee(3,"111",400,45);
    emp[3] = new ContractEmployee(4,"222",420,36);

    for (int i = 0 ; i < emp.length;i++){
        System.out.println(emp[i].toString());
        System.out.println(emp[i].calculatePay());
    }
    }
}
