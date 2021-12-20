public class Order {
    private double harga;
    private String nama;

    public Order(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public void getHarga2(){
        System.out.println(harga);
    }

    public int getQty(int qty){
        return qty;
    }

    public void info(){
        System.out.println("Nama : " + getNama());
    }
}
