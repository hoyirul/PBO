public class Brio extends Honda{
    public String warna;
    public int cc;
    
    public Brio () {}
    
    public Brio(String jenis, String transmisi, int platNomer, String merk, int nomerRangka, int nomerMesin, String warna, int cc, int 9){
        super(jenis, transmisi, platNomer, merk, nomerRangka, nomerMesin);
        this.warna = warna;
        this.cc = cc;
    }

    public void dataBrio(){
        System.out.println ("====Data BRIO====");
        super.dataHonda();
        System.out.println("Warna           : " + warna);
        System.out.println("CC              : " + cc);
    }
}