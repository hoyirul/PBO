// Jawaban no 1 dan 2
// errornya adalah tidak ada keyword extends pada classB jadi akan terjadi error
// karena classA adalah parent class dari classB
public class ClassB extends ClassA{
    public int z;

    public void getNilaiZ(){
        System.out.println("Nilai z : " + z);
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}