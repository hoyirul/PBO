public class Kelas{
    String kdKelas;
    String nmKelas;
    Ruang ruang;

    public Kelas(String kdKelas, String nmKelas){
        this.kdKelas = kdKelas;
        this.nmKelas = nmKelas;
    }

    public void addRuang(Ruang ruang){
        this.ruang = ruang;
    }

    public void showData(){
        System.out.println("1 Kelas untuk 1 ruangan");
        System.out.println("Kode Kelas      : " + kdKelas);
        System.out.println("Nama Kelas      : " + nmKelas);
        System.out.println("Nama Ruang      : " + ruang.nmRuang);
        System.out.println("Kategori Ruang  : " + ruang.ktgRuang);
    }
}