public class Penyewa{
    private String nama, domisili;
    private int umur;

    public Pemilik(String nama, String domisili, String umur){
        this.nama = nama;
        this.domisili = domisili;
        this.umur = umur;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setDomisili(String domisili){
        this.domisili = domisili;
    }

    public String getDomisili(){
        return domisili;
    }

    public void setUmur(String umur){
        this.umur = umur;
    }

    public String getUmur(){
        return umur;
    }

    public void info(){
        
    }
}