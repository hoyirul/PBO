class Bank {
    private String name;

    Bank(String name){
        this.name = name;
    } 

    public String getBankName(){
        return this.name;
    }
}

class Employee{
    private String name; 

    Employee(String name){
        this.name = name;
    } 

    public String getEmployeeName() {
        return this.name;
    } 
} 

class Association{
    public static void main(String[] args){ 
        Bank bank = new Bank("Axis"); 
        Employee emp = new Employee("Neha"); 
        System.out.println(emp.getEmployeeName() + " adalah pegawai dari " + bank.getBankName()); 
    }
}