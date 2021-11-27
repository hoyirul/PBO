public class Main{
    public static void main(String[] args) {
        Pemilik pm = new Pemilik("Ferdi", 20, "Probolinggo");
        Pelanggan pl = new Pelanggan("Siswi", 21, "Lumajang");
        pl.setID("P0001");
        pl.setPassword("123456");
        
        Pelanggan pl2 = new Pelanggan("Elvira", 21, "Kediri");
        pl2.setID("P0002");
        pl2.setPassword("123456");

        Login log2 = new Login("P0002", "123456s");
        log2.setPelanggan(pl);
        log2.loginProcess();
        log2.info();

        Login log = new Login("P0001", "123456");
        log.setPelanggan(pl);
        log.loginProcess();
        log.info();

        System.out.println();

        Merk merk1 = new Merk("BMX 2", 2015);
        Merk merk2 = new Merk("Polygon", 2018);
        SepedaBiasa sb = new SepedaBiasa("Ransi 09", 1500, "Biasa", "Hitam");
        sb.setMerk(merk1);
        SepedaGunung sg = new SepedaGunung("Monarc 5", 3000, "Gunung", "Coklat");
        sg.setMerk(merk2);

        Harga price = new Harga();

        Transaksi tr = new Transaksi("OD001");
        tr.setLamaSewa(2);
        tr.setUser(log);
        tr.setHarga(price);

        tr.info(sg);
    }
}