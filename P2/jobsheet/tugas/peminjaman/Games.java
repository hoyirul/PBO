public class Games{
    private String idGame;
    private String namaGame;
    private float harga;

    public void setIdGame(String idGame){
        this.idGame = idGame;
    }

    public void setNamaGame(String namaGame){
        this.namaGame = namaGame;
    }

    public void setHarga(float harga){
        this.harga = harga;
    }

    public String getIdGame(){
        return idGame;
    }

    public String getNamaGame(){
        return namaGame;
    }

    public float getHarga(){
        return harga;
    }
}