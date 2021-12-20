public class Pemilik extends Identitas{
    private String nama, alamat, id, password;
    private int umur;

    public Pemilik(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    @Override
    public void mempunyaiKTP(){
        if(umur >= 17){
            System.out.println(this.nama + " Mempunyai KTP");
        }else{
            System.out.println(this.nama + " Belum Mempunyai KTP");
        }
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
        System.out.println("-- Pemilik --");
        System.out.println("Nama   : " + this.nama);
        System.out.println("Umur   : " + this.umur);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("ID     : " + this.id);
        System.out.println("Pass   : " + this.password);
    }
}