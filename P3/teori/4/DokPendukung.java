public class DokPendukung{
    public String ktp;
    public String ijazah;

    // Konstruktor
    public DokPendukung(String ktp, String ijazah){
        this.ktp = ktp;
        this.ijazah = ijazah;
    }

    public void tampil(){
        System.out.println("KTP  : " + ktp);
        System.out.println("IJZ  : " + ijazah);
    }
}