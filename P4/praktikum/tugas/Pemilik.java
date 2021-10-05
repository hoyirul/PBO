public class Pemilik{
    private String nama;
    private Orang orang;

    public Pemilik(String nama, Orang orang){
        this.nama = nama;
        this.orang = orang;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setOrang(Orang orang){
        this.orang = orang;
    }

    public Orang getOrang(){
        return orang;
    }

    public void info(){
        System.out.println("Nama   : " + getNama());
        System.out.println(orang.info());
    }
}