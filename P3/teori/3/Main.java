public class Main { 
    public static void main(String args []){ 
        Mahasiswa mahasiswa = new Mahasiswa("Yoga Rahmahadi", 0001);
        Jurusan jurusan = new Jurusan("Teknologi Informasi");
        mahasiswa.addJurusan(jurusan);
        jurusan.addMahasiswa(mahasiswa);
        mahasiswa.info();
    } 
}