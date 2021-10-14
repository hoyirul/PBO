public class Herbivora extends Hewan{
    public void jenisHewan(){
        System.out.println("Hewan herbivora");
    }

    public void jenisMakanan(){
        System.out.println("Herbivora adalah pemakan tubuhan");
    }

    public void info(){
        this.jenisHewan();
        this.jenisMakanan();
        super.makan();
    }
}