public class TestMahasiswa{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "JL. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        mhs2.nim = 102;
        mhs2.nama = "Hairullah";
        mhs2.alamat = "JL. Rengganis No 1A";
        mhs2.kelas = "2A";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "Elvira";
        mhs3.alamat = "JL. Manggis No 1A";
        mhs3.kelas = "2A";
        mhs3.tampilBiodata();

    }
}