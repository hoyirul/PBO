public class Mobil{
    public String jenis, transmisi;
    public int platNomer;

    public Mobil(){

    }

    public Mobil(String jenis, String transmisi, int platNomer){
        this.jenis = jenis;
        this.transmisi = transmisi;
        this.platNomer = platNomer;
    }

    public void dataMobil(){
        System.out.println("Jenis            : " + jenis);
        System.out.println("Transmisi        : " + transmisi);
        System.out.println("Plat Nomor       : " + platNomer);
    }
}