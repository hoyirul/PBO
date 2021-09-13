public class Karyawan{
    private String id;
    private String nama;
    private char jk;
    private String jabatan;
    private double gaji;

    public void setId(String id){
        this.id = id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJk(char jk){
        this.jk = jk;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public String getId(){
        return id;
    }

    public String getNama(){
        return nama;
    }

    public char getJk(){
        return jk;
    }

    public String getJabatan(){
        return jabatan;
    }

    public double getGaji(){
        return gaji;
    }

    public void info(){
        System.out.println("ID      : " + getId());
        System.out.println("NAMA    : " + getNama());
        System.out.println("JK      : " + getJk());
        System.out.println("JABATAN : " + getJabatan());
        System.out.println("GAJI    : " + infoGaji());
    }

    public double infoGaji(){
        if(getJabatan() == "Manager"){
            setGaji(5000000);
        }else{
            setGaji(3000000);
        }
        
        return getGaji();
    }
}