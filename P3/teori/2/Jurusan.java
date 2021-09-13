public class Jurusan{
    String kdJurusan;
    String nmJurusan;
    Prodi prodi;

    public Jurusan(String kdJurusan, String nmJurusan){
        this.kdJurusan = kdJurusan;
        this.nmJurusan = nmJurusan;
    }

    public void addProdi(Prodi prodi){
        this.prodi = prodi;
    }

    public void showData(){
        System.out.println("1 Jurusan untuk Banyak Prodi");
        System.out.println("Kode Jurusan    : " + kdJurusan);
        System.out.println("Nama Jurusan    : " + nmJurusan);
        System.out.println("Kode Prodi      : " + prodi.kdProdi);
        System.out.println("Nama Prodi      : " + prodi.nmProdi);
    }
}