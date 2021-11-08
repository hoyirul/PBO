public class Main{
    public static void main(String[] args) {
        Ponsel ps = new Ponsel();
        Smartphone sp = new Smartphone();

        System.out.println("Ponsel");
        ps.berkomunikasi();
        ps.panggilanTelfon();
        ps.mengirimSMS();

        System.out.println();
        
        System.out.println("Smartphone");
        ps.berkomunikasi();
        sp.panggilanTelfon();
        sp.mengirimSMS();
    }
}