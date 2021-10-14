public class Anjing extends Mamalia{
    public void berbulu(){
        System.out.println("Anjing adalah hewan berbulu");
    }

    public void info(){
        this.berbulu();
        super.berlari();
        super.beranak();
        super.makan();
    }
}