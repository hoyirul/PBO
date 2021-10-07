public class Segitiga extends BangunDatar{
    private int a, t;

    public Segitiga(){}
    
    public Segitiga(int a, int t){
        this.a = a;        
        this.t = t;        
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public void setT(int t){
        this.t = t;
    }

    public int getT(){
        return t;
    }

    public float getLuas(){
        super.luas = 0.5f * (getA() * getT());
        return super.luas;
    }

    public float getKeliling(){
        super.keliling = 4 * getA();
        return super.keliling;
    }

    public void info(){
        System.out.println("Bangun Datar Segitiga");
        System.out.println("Luas Segitiga      : " + getLuas());
        System.out.println("Keliling Segitiga  : " + getKeliling());
    }
}