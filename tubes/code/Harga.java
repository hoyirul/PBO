public class Harga {
    public double hitungHarga(Sepeda spd){
        double harga = spd.getHarga();

        if(spd instanceof SepedaGunung){
            harga += ((SepedaGunung)spd).getHarga();
        }else if(spd instanceof SepedaBiasa){
            harga += ((SepedaBiasa)spd).getHarga();
        }

        return harga;
    }
}