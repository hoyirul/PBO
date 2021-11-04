public class Main{
    public static void main(String[] args) {
        Segitiga tiga = new Segitiga();
        System.out.println("Sudut : " +  tiga.totalSudut(30));
        System.out.println("Sudut : " + tiga.totalSudut(40, 90));
        System.out.println("Keliling : " + tiga.keliling(10, 5, 15));
        System.out.println("Keliling : " + tiga.keliling(10, 5));
    }
}