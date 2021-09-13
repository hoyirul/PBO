public class Ruang{
    String kdRuang;
    String nmRuang;
    String ktgRuang;
    Kelas kelas;

    public Ruang(String kdRuang, String nmRuang, String ktgRuang){
        this.kdRuang = kdRuang;
        this.nmRuang = nmRuang;
        this.ktgRuang = ktgRuang;
    }

    public void addKelas(Kelas kelas){
        this.kelas = kelas;
    }

    public void showData(){
        System.out.println("1 Ruang untuk Banyak Kelas");
        System.out.println("Kode Ruang      : " + kdRuang);
        System.out.println("Nama Ruang      : " + nmRuang);
        System.out.println("Kategori Ruang  : " + ktgRuang);
        System.out.println("Nama Kelas      : " + kelas.nmKelas);
    }
}