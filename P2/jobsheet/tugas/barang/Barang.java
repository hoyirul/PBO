public class Barang{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        diskon = diskon / 100;
        int dis = (int) diskon;
        int hargaJual = hargaDasar - (dis * hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode           : " + kode);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Dasar    : " + hargaDasar);
        System.out.println("Diskon         : " + diskon);
        System.out.println("Harga Jual     : " + hitungHargaJual());
    }
}