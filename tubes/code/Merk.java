public class Merk{
    private String namaMerk;
    private int tahun;

    public Merk(String namaMerk, int tahun){
        this.namaMerk = namaMerk;
        this.tahun = tahun;
    }

    public String getNamaMerk(){
        return namaMerk;
    }

    public int getTahun(){
        return tahun;
    }

    public void info(){
        System.out.println("Nama Merk : " + this.namaMerk);
        System.out.println("Tahun     : " + this.tahun);
    }
}