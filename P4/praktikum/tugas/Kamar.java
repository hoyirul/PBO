public class Kamar{
    private String tipe, nomor;
    private Pelanggan pelanggan;
    private Pemilik pemilik;

    public Kamar(){}

    public Kamar(String tipe, String nomor){
        this.tipe = tipe;
        this.nomor = nomor;
        this.pelanggan = null;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public String getTipe(){
        return tipe;
    }

    public void setNomor(String nomor){
        this.nomor = nomor;
    }

    public String getNomor(){
        return nomor;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan(){
        return pelanggan;
    }

    public void setPemilik(Pemilik pemilik){
        this.pemilik = pemilik;
    }

    public Pemilik getPemilik(){
        return pemilik;
    }

    public String info() {
        String info = "";
        info += "Tipe   : " + getTipe() + "\n";
        info += "Nomor  : " + nomor + "\n";
        if (this.pelanggan != null) {
           info += "Pelanggan " + pelanggan.info() + "\n";
        }
        return info;
    }

    public void infoPemilik(){
        System.out.println("----------------------------------------");
        System.out.println("---- INFORMASI PEMILIK KOSAN MALANG ----");
        pemilik.info();
        System.out.println("----------------------------------------");
    }
}