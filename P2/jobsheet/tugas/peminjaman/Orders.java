public class Orders{
    private int id, lamaSewa;
    private float total;
    private Games game = new Games();
    private Members member = new Members();

    public void setIdGame(String idGame){
        game.setIdGame(idGame);
    }

    public void setNamaGame(String namaGame){
        game.setNamaGame(namaGame);
    }
    
    public void setHarga(float harga){
        game.setHarga(harga);
    }

    public void setIdMember(String idMember){
        member.setIdMember(idMember);
    }

    public void setNamaMember(String namaMember){
        member.setNamaMember(namaMember);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setLamaSewa(int lamaSewa){
        this.lamaSewa = lamaSewa;
    }

    public int getId(){
        return id;
    }

    public int getLamaSewa(){
        return lamaSewa;
    }

    public float getTotal(){
        total = getLamaSewa() * game.getHarga();
        return total;
    }

    public void detailOrders(){
        System.out.println("ID Pinjam   : " + getId());
        System.out.println("ID/Member   : " + member.getIdMember() + " / " +member.getNamaMember());
        System.out.println("ID/Game     : " + game.getIdGame() + " / " + game.getNamaGame());
        System.out.println("Lama Sewa   : " + getLamaSewa() + " Hari");
        System.out.println("Harga       : Rp. " + game.getHarga());
        System.out.println("----------------------------------");
        System.out.println("TOTAL       : RP. " + getTotal());
        System.out.println();
    }
}