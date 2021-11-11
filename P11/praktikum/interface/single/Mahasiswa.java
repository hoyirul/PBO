public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-KU lebih dari 3,51");
    }
}
