public class Transaksi {
    private String orderID;
    private int lama;
    private Login user;
    private Harga hg;
    private Pelanggan pelanggan;

    public Transaksi(String orderID){
        this.orderID = orderID;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan(){
        return pelanggan;
    }

    public void setUser(Login user){
        this.user = user;
    }

    public void setHarga(Harga hg){
        this.hg = hg;
    }

    public Login getUser(){
        return user;
    }

    public Harga getHarga(){
        return hg;
    }

    public void setLamaSewa(int lama){
        this.lama = lama;
    }

    public int getLamaSewa(){
        return lama;
    }

    public void info(Sepeda spd){
        double ppn = 0, harga = 0;
        if(user.isLogin() == false){
            System.out.println("Mohon maaf anda belum login");
        }else{
           
            System.out.println("-- Info Transaksi --");
            System.out.println("OrderID      : " + this.orderID);
            
            getPelanggan().info();

            if(spd instanceof SepedaGunung){
                ((SepedaGunung)spd).info();
                harga = ((SepedaGunung)spd).getHarga();
                ppn = ((SepedaGunung)spd).getHarga() * 10/100;
            }else if(spd instanceof SepedaBiasa){
                ((SepedaBiasa)spd).info();
                harga = ((SepedaBiasa)spd).getHarga();
                ppn = ((SepedaBiasa)spd).getHarga() * 10/100;
            }

            System.out.println("Harga        : " + harga);
            System.out.println("PPN(10%)     : " + ppn);
            System.out.println("Harga + PPN  : " + hg.hitungHarga(spd) + " /jam");
            System.out.println("LamaSewa     : " + this.lama + " jam");
            System.out.println("-------------------------");
            System.out.println("Total        : " + hg.hitungHarga(spd) * this.lama);
        }
    }
}