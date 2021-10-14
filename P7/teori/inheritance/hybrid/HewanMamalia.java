public class HewanMamalia extends Mamalia{
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void berbulu(){
        System.out.println(getNama() + " adalah hewan berbulu");
    }

    public void info(){
        System.out.println("Nama hewan : " + getNama());
        super.makan();
        super.berlari();
        super.beranak();
    }
}