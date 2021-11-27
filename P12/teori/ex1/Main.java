public class Main{
    public static void main(String[] args) {
        Manajer man = new Manajer("Roni", 800, 50);
        Programmer prog = new Programmer("Buni", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Hitung Bayaran Manager : " + hr.hitungBayaran(man));
        System.out.println("Hitung Bayaran Pegawai : " + hr.hitungBayaran(prog));
    }
}