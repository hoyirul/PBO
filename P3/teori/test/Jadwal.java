public class Jadwal{
    public String hari;
    public String jam;
    public Matkul mk;
    public Dosen dosen;
    public Link link;

    public Jadwal(String hari, String jam){
        // sama
    }

    public void getMk(Matkul mk){
        this.mk = mk;
    }

    public void getDosen(Matkul dosen){
        this.dosen = dosen;
    }
}