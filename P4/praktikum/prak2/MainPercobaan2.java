public class MainPercobaan2{
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m); // untuk set objek dari class Mobil
        p.setSopir(s); // untuk set objek dari class Sopir
        p.setHari(2);
        System.out.println("Biaya Total = " +  p.hitungBiayaTotal());
        System.out.println(p.getMobil().getNama());
    }
}