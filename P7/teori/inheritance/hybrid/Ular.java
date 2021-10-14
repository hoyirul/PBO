public class Ular extends Reptil{

    protected String namaHewan;

    public void 

    public void bersisik(){
        System.out.println("Ular adalah hewan bersisik");
    }

    public void info(){
        this.bersisik();
        super.melata();
        super.bertelur();
        super.makan();
    }
}