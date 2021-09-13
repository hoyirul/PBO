public class Main{
    public static void main(String[] args) {
        // Instansiasi Objek 
        Mahasiswa mhs1 = new Mahasiswa("Yogacuk", 123);
        DokPendukung dk1 = new DokPendukung("Oke", "Oke");
        
        mhs1.getDk(dk1);
        mhs1.tampil();

        // dk1.tampil();
    }
}