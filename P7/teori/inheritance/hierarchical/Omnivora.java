public class Omnivora extends Hewan{
    public void jenisHewan(){
        System.out.println("Hewan omnivora");
    }

    public void jenisMakanan(){
        System.out.println("Omnivora adalah pemakan segala(tumbuhan + daging)");
    }

    public void info(){
        this.jenisHewan();
        this.jenisMakanan();
        super.makan();
    }
}