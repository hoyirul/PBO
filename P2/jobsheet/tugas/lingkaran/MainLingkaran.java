public class MainLingkaran{
    public static void main(String[] args) {
        Lingkaran circle1 = new Lingkaran();

        circle1.r = 4;
        System.out.println("Lingkaran 1");
        System.out.println("Luas Lingkaran Adalah       : " + circle1.hitungLuas());
        System.out.println("Keliling Lingkaran Adalah   : " + circle1.hitungKeliling());

        circle1.r = 21;
        System.out.println("\nLingkaran 2");
        System.out.println("Luas Lingkaran Adalah       : " + circle1.hitungLuas());
        System.out.println("Keliling Lingkaran Adalah   : " + circle1.hitungKeliling());
    }
}