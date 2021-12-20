public class Harga {
    public double hitungHarga(Sepeda spd){
        double harga = spd.getHarga();

        if(spd instanceof SepedaBiasa){
            harga = ((SepedaBiasa)spd).getHarga() + ((SepedaBiasa)spd).getHarga() * 10/100;
        }else if(spd instanceof SepedaGunung){
            harga = ((SepedaGunung)spd).getHarga() + ((SepedaGunung)spd).getHarga() * 10/100;
        }

        return harga;
    }
}