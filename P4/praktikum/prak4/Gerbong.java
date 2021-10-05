public class Gerbong{
    private String kode;
    private Kursi arrayKursi[];
    private int checker = 0; 
    private int count = 0;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    // Ini telah dimodifikasi
    public void setPenumpang(Penumpang penumpang, int nomor) {
        if(count == arrayKursi.length-1){
            System.out.println("MOHON MAAF KURSI TELAH HABIS KARENA HANYA MEMUAT 10 KURSI");
        }else{
            if(checker == nomor && nomor != 0){
                System.out.println("KURSI NOMOR "+ (count + 1) +" TELAH DIGUNAKAN");
                System.out.println("MAKA ANDA AKAN DIKURSI NOMOR " + (count + 2));
                System.out.println("----------------------------------");
                count += 1;
                this.arrayKursi[count].setPenumpang(penumpang);
            }else{
                checker += 1;
                this.arrayKursi[count].setPenumpang(penumpang);
            }
        }
    }

    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
        
}