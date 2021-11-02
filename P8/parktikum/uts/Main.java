public class Main{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Elvira Sania");
        emp.setAddress("Kota Kediri");
        emp.setNoTelp("08787676556");
        emp.setUsername("admin");
        emp.setPassword("12345");

        Sender sdr = new Sender();
        sdr.setName("Hairullah");
        sdr.setAddress("Kota Kediri");
        sdr.setNoTelp("0878767765");

        // User with login
        Login auth1 = new Login();
        
        auth1.setEmployee(emp);
        auth1.setUsername("admin");
        auth1.setPassword("12345");
        auth1.authLog();
        auth1.getErrors();
        
        Process pro1 = new Process("JN008276477", "10-10-2021", "Cintya Aprilia", "Jalan Kenanga No 19, Besuki Kota.", "62199", "Elektronik", 2, 5000);
        pro1.setEmployee(emp);
        pro1.setSender(sdr);
        pro1.printResi();

        System.out.println();
        pro1.printReport();
        
        System.out.println();
        pro1.info();
        
    }
}