public class Dosen extends Pegawai{
    private int jumlahSKS, tarifSKS;

    public Dosen(String nip, String nama, String alamat){
        super.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
    }

    public void setSKS(int sks){
        
    }

    public int getGaji(){
        return super.getGaji();
    }
}