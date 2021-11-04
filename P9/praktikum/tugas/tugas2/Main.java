public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen ds = new Dosen();

        mhs.bernafas();
        mhs.makan();
        mhs.tidur();

        System.out.println();

        ds.bernafas();
        ds.makan();
        ds.lembur();
    }
}