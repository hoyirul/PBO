public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji(){
        return gaji = gaji + bonus;
    }

    public int getBonus(){
        return bonus;
    }
}