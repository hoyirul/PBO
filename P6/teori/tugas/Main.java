public class Main{
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.setR(5);
        l1.setPhi(3.14f);
        l1.info();
        
        System.out.println();
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setP(5);
        pp1.setL(7);
        pp1.info();

        System.out.println();
        Segitiga sg1 = new Segitiga();
        sg1.setA(6);
        sg1.setT(7);
        sg1.info();
    }
}