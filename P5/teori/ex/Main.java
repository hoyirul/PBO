public class Main{
    public static void main(String[] args) {
        Barang brg = new Barang();
        Orang org = new Orang("Banci", 12, "Malang");
        Orang org2 = new Orang("Wanita", 16, "Mojokerto");

        brg.setName("Yoga");
        brg.setDomisili("Mojokerto");
        brg.setOrang(org);
        System.out.println("Nama : " + brg.getName());
        System.out.println("Kota : " + brg.getDomisili());
        
        Barang brg2 = new Barang("Yoby", "Pasuruan");
        brg2.setOrang(org2);
        brg2.info();

        Barang brg3 = new Barang("Maulana", "Malang");
        System.out.println("Nama : " + brg3.getName());
        System.out.println("Kota : " + brg3.getDomisili());
    }
}