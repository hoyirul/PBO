public class HewanReptil extends Reptil{
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void bersisik(){
        System.out.println(getNama() + " adalah hewan bersisik");
    }

    public void info(){
        System.out.println("Nama hewan : " + getNama());
        super.makan();
        super.melata();
        super.bertelur();
    }
}