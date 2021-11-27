public class Sepeda{
    protected String namaSepeda;
    protected double harga;

    public Sepeda(String namaSepeda, double harga){
        this.namaSepeda = namaSepeda;
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }
}