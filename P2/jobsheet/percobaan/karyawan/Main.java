public class Main{
    public static void main(String[] args) {
        Karyawan emp1 = new Karyawan();
        
        System.out.println("EMPLOYEE 1");
        emp1.setId("EM001");
        emp1.setNama("Hairullah");
        emp1.setJk('L');
        emp1.setJabatan("Manager");
        emp1.info();
        
        Karyawan emp2 = new Karyawan();
        System.out.println("\nEMPLOYEE 2");
        emp2.setId("EM001");
        emp2.setNama("Elvira");
        emp2.setJk('P');
        emp2.setJabatan("Karyawan");
        emp2.info();
    }
}