public class Main { 
    public static void main(String args []){ 
        Mahasiswa mahasiswa = new Mahasiswa("Yoga Rahmahadi", 0001);
        Jurusan jurusan = new Jurusan("Teknologi Informasi");
        // System.out.println("Nama    : " + mahasiswa.getNama());
        mahasiswa.info();
    }
}