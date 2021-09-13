public class Prodi{
    String kdProdi;
    String nmProdi;
    Jurusan jurusan;

    public Prodi(String kdProdi, String nmProdi){
        this.kdProdi = kdProdi;
        this.nmProdi = nmProdi;
    }

    public void addJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }

    public void showData(){
        System.out.println("1 Prodi untuk 1 Jurusan");
        System.out.println("Kode Prodi      : " + kdProdi);
        System.out.println("Nama Prodi      : " + nmProdi);
        System.out.println("Kode Jurusan    : " + jurusan.kdJurusan);
        System.out.println("Nama Jurusan    : " + jurusan.nmJurusan);
    }
}