public class PersegiPanjang extends BangunDatar{
    private int p, l;

    public PersegiPanjang(){}
    
    public PersegiPanjang(int p, int l){
        this.p = p;        
        this.l = l;        
    }

    public void setP(int p){
        this.p = p;
    }

    public int getP(){
        return p;
    }

    public void setL(int l){
        this.l = l;
    }

    public int getL(){
        return l;
    }

    public float getLuas(){
        super.luas = getP() * getL();
        return super.luas;
    }

    public float getKeliling(){
        super.keliling = 2 * (getP() + getL());
        return super.keliling;
    }

    public void info(){
        System.out.println("Bangun Datar Persegi Panjang");
        System.out.println("Luas Persegi Panjang      : " + getLuas());
        System.out.println("Keliling Persegi Panjang  : " + getKeliling());
    }
}