public class Mahasiswa{
    public String nama;
    public int nim;
    public DokPendukung dk; // tambah ini

    // Konstruktor
    public Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

    // tambah ini
    public void getDk(DokPendukung dk){
        this.dk = dk;
    }

    public void tampil(){
        System.out.println("NIM  : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("KTP  : " + dk.ktp); // tambah ini
        System.out.println("IJZ  : " + dk.ijazah); // tambah ini
    }
}