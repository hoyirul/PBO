public class Lingkaran extends BangunDatar{
    private int r; 
    private float phi;

    public Lingkaran(){}

    public Lingkaran(int r, float phi){
        this.r = r;
        this.phi = phi;
    }

    public void setR(int r){
        this.r = r;
    }

    public int getR(){
        return r;
    }

    public void setPhi(float phi){
        this.phi = phi;
    }

    public float getPhi(){
        return phi;
    }

    public float getLuas(){
        super.luas = getPhi() * getR() * getR();
        return super.luas;
    }

    public float getKeliling(){
        super.keliling = 2 * (getPhi() * getR());
        return super.keliling;
    }

    public void info(){
        System.out.println("Bangun Datar Lingkaran");
        System.out.println("Luas lingkaran      : " + getLuas());
        System.out.println("Keliling lingkaran  : " + getKeliling());
    }
}