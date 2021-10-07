public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.setNama("Mochammad Hairullah");
        d1.setSKS(12);
       
        Pegawai p1 = new Pegawai();
        p1.setNama("Elvira Sania");
       
        DaftarGaji daftar_gaji = new DaftarGaji(2);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}