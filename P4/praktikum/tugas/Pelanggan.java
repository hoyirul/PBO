public class Pelanggan{
    private String nama;
    private Orang orang;

    public Pelanggan(String nama, Orang orang){
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

    public String info(){
        String info = "";
        info += "\nNama   : " + getNama() + "\n";
        if (this.orang != null) {
            info += "" + orang.info() + "\n";
        }
        return info;
    }
}