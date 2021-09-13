public class Mahasiswa { 
    public String nama; 
    public int nim; 
    public Jurusan jurusan;
    
    public Mahasiswa(String nama, int nim){
        this.nama = nama; 
        this.nim = nim;
    }

    public void addJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }

    public void info(){
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan.namaJurusan);
    }
}