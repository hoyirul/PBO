public class Anggota{
    private String no_ktp;
    private String nama;
    private float jumlah_pinjaman;
    private float limit;

    public Anggota(String no_ktp, String nama, float limit){
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.limit = limit;
        this.jumlah_pinjaman = 0;
    }

    public void setNoKtp(String no_ktp){
        this.no_ktp = no_ktp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setLimitPinjaman(float limit){
        this.limit = limit;
    }

    public String getNama(){
        return nama;
    }

    public float getJumlahPinjaman(){
        return jumlah_pinjaman;
    }

    public String getNoKtp(){
        return no_ktp;
    }

    public float getLimitPinjaman(){
        return limit;
    }

    public void angsur(float uang){
        float min_angsur = (float) 0.10 * jumlah_pinjaman; // 10 % dari jumlah pinjaman
        if(uang != min_angsur){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!!");
            System.out.println("Jumlah yang harus dibayar : " + min_angsur);
        }else{
            this.jumlah_pinjaman -= uang;
        }
    }

    public void pinjam(float uang){
        if((uang + jumlah_pinjaman) > limit){
            System.out.println("Maaf, jumlah pinjaman melebihi limit!!");
        }else{
            this.jumlah_pinjaman += uang;
        }
    }
}