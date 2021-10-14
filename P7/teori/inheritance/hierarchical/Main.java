public class Main{
    public static void main(String[] args) {
        Karnivora kr = new Karnivora();
        kr.info();

        System.out.println();
        Herbivora hb = new Herbivora();
        hb.info();

        System.out.println();
        Omnivora om = new Omnivora();
        om.info();
    }
}