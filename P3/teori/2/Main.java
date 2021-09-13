public class Main{
    public static void main(String[] args) {
        Jurusan jrs1 = new Jurusan("J001", "Teknologi Informasi");
        Prodi prd1 = new Prodi("P001", "Teknik Informatika");
        jrs1.addProdi(prd1);
        prd1.addJurusan(jrs1);

        // Jurusan
        jrs1.showData();

        System.out.println();
        
        // Prodi
        prd1.showData();
    }
}