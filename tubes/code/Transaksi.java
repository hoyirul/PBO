public class Transaksi {
    private String orderID;
    private int lama;
    private Login user;
    private Harga hg;

    public Transaksi(String orderID){
        this.orderID = orderID;
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
        if(user.loginProcess() == false){
            System.out.println("Mohon maaf anda belum login");
        }else{
           
            System.out.println("-- Info Transaksi --");
            System.out.println("OrderID      : " + this.orderID);

            if(spd instanceof SepedaGunung){
                ((SepedaGunung)spd).info();
            }else if(spd instanceof SepedaBiasa){
                ((SepedaBiasa)spd).info();
            }

            System.out.println("Harga        : " + hg.hitungHarga(spd) + " /jam");
            System.out.println("LamaSewa     : " + this.lama + " jam");
            System.out.println("-------------------------");
            System.out.println("Total        : " + hg.hitungHarga(spd) * this.lama);
        }
    }
}