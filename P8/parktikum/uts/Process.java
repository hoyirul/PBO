public class Process{
    private String resi, date, receiver, address, postalCode, itemType;
    private float weight, price, total;
    private Sender sender;
    private Employee employee;

    public Process(){}

    public Process(String resi, String date, String receiver, String address, String postalCode, String itemType, float weight, float price){
        this.resi = resi;
        this.date = date;
        this.receiver = receiver;
        this.address = address;
        this.postalCode = postalCode;
        this.itemType = itemType;
        this.weight = weight;
        this.price = price;
        this.sender = null;
        this.employee = null;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee(){
        return employee;
    }

    public void setSender(Sender sender){
        this.sender = sender;
    }

    public Sender getSender(){
        return sender;
    }

    public float getTotal(){
        return total = price * weight;
    }

    public void printResi(){
        System.out.println("----------------- CETAK RESI J&T Express -----------------");
        System.out.println("Operator        : " + employee.getName());
        System.out.println("Pengirim        : " + sender.getName());
        System.out.println("NoTelp Pengirim : " + sender.getNoTelp());
        System.out.println("----------------- Detail RESI -----------------");
        System.out.println("Penerima        : " + receiver);
        System.out.println("Alamat          : " + address + " Kode POS : " + postalCode);
        System.out.println("Tanggal         : " + date);
        System.out.println("Jenis Barang    : " + itemType);
        System.out.println("Berat Barang    : " + weight + " KG");
        System.out.println("Harga Barang    : Rp " + price);
        System.out.println("Biaya ADM       : Rp " + 4000);
        System.out.println("-------------------------------------");
        System.out.println("Total           : Rp " + (getTotal() + 4000));
        System.out.println("----------------- TERIMA KASIH -----------------");
    }

    public void printReport(){
        System.out.println("----------------- CETAK Laporan J&T Express -----------------");
        System.out.println("Operator        : " + employee.getName());
        System.out.println("Pengirim        : " + sender.getName());
        System.out.println("NoTelp Pengirim : " + sender.getNoTelp());
        System.out.println("----------------- Detail RESI -----------------");
        System.out.println("Penerima        : " + receiver);
        System.out.println("Alamat          : " + address + " Kode POS : " + postalCode);
        System.out.println("Tanggal         : " + date);
        System.out.println("Jenis Barang    : " + itemType);
        System.out.println("Berat Barang    : " + weight + " KG");
        System.out.println("Harga Barang    : Rp " + price);
        System.out.println("Biaya ADM       : Rp " + 4000);
        System.out.println("-------------------------------------");
        System.out.println("Total           : Rp " + (getTotal() + 4000));
        System.out.println("----------------- TERIMA KASIH -----------------");
    }

    public void info(){
        System.out.println("----------------- J&T Express -----------------");
        System.out.println("Operator");
        System.out.println("Nama        : " + employee.getName());
        System.out.println("NoTelp      : " + employee.getNoTelp());
        System.out.println("Pengirim");
        System.out.println("Nama        : " + employee.getName());
        System.out.println("Alamat      : " + employee.getAddress());
        System.out.println("NoTelp      : " + sender.getNoTelp());
        System.out.println("----------------- Detail RESI -----------------");
        System.out.println("Penerima        : " + receiver);
        System.out.println("Alamat          : " + address + " Kode POS : " + postalCode);
        System.out.println("Tanggal         : " + date);
        System.out.println("Jenis Barang    : " + itemType);
        System.out.println("Berat Barang    : " + weight + " KG");
        System.out.println("Harga Barang    : Rp " + price);
        System.out.println("Biaya ADM       : Rp " + 4000);
        System.out.println("-------------------------------------");
        System.out.println("Total           : Rp " + (getTotal() + 4000));
        System.out.println("============ TERIMA KASIH ============");
    }
}