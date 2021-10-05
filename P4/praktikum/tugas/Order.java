public class Order{
    private String kdKosan;
    private Kamar arrayKamar[];
    private int checker = 0; 
    private int count = 0;

    public Order(String kdKosan, int jumlah) {
        this.kdKosan = kdKosan;
        this.arrayKamar = new Kamar[jumlah];
        this.init();
    }

    private void init() {
        for (int i = 0; i < arrayKamar.length; i++) {
            this.arrayKamar[i] = new Kamar("TIPE A" + (i + 1), String.valueOf(i + 1));
        }
    }

    public void setKdKosan(String kdKosan){
        this.kdKosan = kdKosan;
    }

    public String getKdKosan(){
        return kdKosan;
    }

    public void setPelanggan(Pelanggan pelanggan, int nomor) {
        if(count == arrayKamar.length - 1){
            System.out.println("MOHON MAAF KAMAR TELAH HABIS");
        }else{
            if(checker == nomor && nomor != 0){
                System.out.println("KAMAR NOMOR "+ (count + 1) +" TELAH DITEMPATI");
                System.out.println("MAKA ANDA AKAN DIKAMAR NOMOR " + (count + 2));
                System.out.println("----------------------------------");
                count += 1;
                this.arrayKamar[count].setPelanggan(pelanggan);
            }else{
                checker += 1;
                this.arrayKamar[count].setPelanggan(pelanggan);
            }
        }
    }

    public Kamar[] getArrayKamar(){
        return arrayKamar;
    }
    
    public String info() {
        String info = "";
        info += "KdKosan : " + getKdKosan() + "\n";
        info += "------------------------------\n";
        for (Kamar kamar : arrayKamar) {
            info += kamar.info();
        }
        return info;
    }
}