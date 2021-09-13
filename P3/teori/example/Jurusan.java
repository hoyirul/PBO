public class Jurusan {
    public String namaJurusan; 
    public Mahasiswa mahasiswa;
    
    public Jurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
        mahasiswa = null;
    }

    public void addMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }

    public void info(){
        System.out.println("NIM     : " + mahasiswa.nim);
        System.out.println("Nama    : " + mahasiswa.nama);
        System.out.println("Jurusan : " + namaJurusan);
    }
}