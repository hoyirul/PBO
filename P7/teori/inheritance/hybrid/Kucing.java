public class Kucing extends Mamalia{
    public void berbulu(){
        System.out.println("Kucing adalah hewan berbulu");
    }

    public void info(){
        this.berbulu();
        super.berlari();
        super.beranak();
        super.makan();
    }
}