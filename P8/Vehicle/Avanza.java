public class Avanza extends Toyota{
    public String warna;
    public int cc;
    
    public Avanza () {}
    
    public Avanza (String jenis, String transmisi, int platNomer, String merk, int nomerRangka, int nomerMesin, String warna, int cc){
        super(jenis, transmisi, platNomer, merk, nomerRangka, nomerMesin);
        this.warna = warna;
        this.cc = cc;
    }

    public void datAvanza(){
        System.out.println ("====Data Avanza====");
        super.dataHonda();
        System.out.println("Warna           : " + warna);
        System.out.println("CC              : " + cc);
    }
}