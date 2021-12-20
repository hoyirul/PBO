public class SepedaGunung extends Sepeda{
    private String jenis, warna;

    public SepedaGunung(String namaSepeda, double harga, String jenis, String warna){
        super(namaSepeda, harga);
        this.jenis = jenis;
        this.warna = warna;
    }

    public void setMerk(Merk merk){
        this.merk = merk;
    }

    public Merk getMerk(){
        return merk;
    }

    public double getHarga(){
        return harga;
    }

    public void info(){
        System.out.println("------------------------------------");
        System.out.println("Nama Sepeda  : " + namaSepeda);
        System.out.println("Merk Sepeda  : " + merk.getNamaMerk());
        System.out.println("Tahun Sepeda : " + merk.getTahun());
        System.out.println("Jenis Sepeda : " + this.jenis);
        System.out.println("Warna Sepeda : " + this.warna);
        System.out.println("------------------------------------");
    }
}