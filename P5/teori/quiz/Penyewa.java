public class Penyewa{
    private String nama, ktp, domisili;
    private int umur;

    public Penyewa(String nama, String ktp, String domisili, String umur){
        this.nama = nama;
        this.ktp = ktp;
        this.domisili = domisili;
        this.umur = umur;
    }

    public void setNama(String nama){ // input nama
        this.nama = nama;
    }

    public String getNama(){ // mengambil nama
        return nama;
    }

    public void setKtp(String ktp){
        this.ktp = ktp;
    }

    public String getKtp(){
        return ktp;
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