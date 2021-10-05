import java.util.Random;
public class MainKosan{
    public static void main(String[] args) {
        Random rand = new Random();
        int id = rand.nextInt(1000);

        Orang org1 = new Orang("Pria", 18, "Bondowoso"); 
        Orang org2 = new Orang("Wanita", 35, "Malang"); 
        Pemilik pem = new Pemilik("Rosalia", org2);
        Kamar km = new Kamar();
        km.setPemilik(pem);
        km.infoPemilik();
        
        Pelanggan endru = new Pelanggan("Endru", org1);
        Pelanggan roni = new Pelanggan("RONI", org1);
        Order orders = new Order("ID"+String.valueOf(id), 10);
        
        orders.setPelanggan(endru, 1);
        orders.setPelanggan(roni, 1);
        System.out.println(orders.info());
    }
}