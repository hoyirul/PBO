public class Pemilik extends Identitas{
    private String nama, alamat;
    private int umur;

    public Pemilik(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    @Override
    public void mempunyaiKTP(){
        System.out.println(this.nama + " Mempunyai KTP");
    }

    public void info(){
        System.out.println("-- Pemilik --");
        System.out.println("Nama   : " + this.nama);
        System.out.println("Umur   : " + this.umur);
        System.out.println("Alamar : " + this.alamat);
    }
}