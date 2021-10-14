public class Karnivora extends Hewan{
    public void jenisHewan(){
        System.out.println("Hewan karnivora");
    }

    public void jenisMakanan(){
        System.out.println("Karnivora adalah pemakan daging");
    }

    public void info(){
        this.jenisHewan();
        this.jenisMakanan();
        super.makan();
    }
}