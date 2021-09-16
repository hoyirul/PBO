public class Main { 
    public static void main(String args []){ 
        Mahasiswa mahasiswa = new Mahasiswa("Yoga Rahmahadi", 0001);
        Jurusan jurusan = new Jurusan("Teknologi Informasi");
        // System.out.println("Nama    : " + mahasiswa.getNama());
        mahasiswa.info();

        Dosen ds1 = new Dosen("Yoga Rahmahadi", "KD001");
        Matkul mk1 = new Matkul("TI", "K001");
        Jadwal jd1 = new Jadwal("senin", "10");
 
        jd1.getMk(mk1);
    }
}