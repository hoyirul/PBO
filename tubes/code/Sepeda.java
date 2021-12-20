public class Sepeda{
    protected String namaSepeda;
    protected double harga;
    protected Merk merk;

    public Sepeda(String namaSepeda, double harga){
        this.namaSepeda = namaSepeda;
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }

    public void setMerk(Merk merk){}

    public void info(){}
}