public class Buaya extends Reptil{
    public void bersisik(){
        System.out.println("Buaya adalah hewan bersisik");
    }

    public void info(){
        this.bersisik();
        super.merayap();
        super.bertelur();
        super.makan();
    }
}