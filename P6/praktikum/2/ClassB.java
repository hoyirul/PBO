// menambahkan extends
public class ClassB extends ClassA{
    private int z;

    public void setZ(int z){
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("Nilai z : " + z);
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}