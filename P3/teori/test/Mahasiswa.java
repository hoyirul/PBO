public class Mahasiswa { 
    private String nama; 
    private int nim;
    
    public Mahasiswa(String nama, int nim){ 
        this.nama = nama; 
        this.nim = nim;
    }

    public String getNama(String nama){
        return this.nama;
    }

    public int getNim(int nim){
        return this.nim;
    }

    public void info(){
        System.out.println("Nama : " + getNama());
    }
}