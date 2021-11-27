public class Pelanggan extends Identitas{
    private String nama, alamat, id, password;
    private int umur;

    public Pelanggan(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    @Override
    public void mempunyaiKTP(){
        System.out.println(this.nama + " Mempunyai KTP");
    }

    public void setID(String id){
        this.id = id;
    }

    public String getID(){
        return id;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void info(){
        System.out.println("-- Pelanggan --");
        System.out.println("ID     : " + this.id);
        System.out.println("Nama   : " + this.nama);
        System.out.println("Umur   : " + this.umur);
        System.out.println("Alamar : " + this.alamat);
    }
}