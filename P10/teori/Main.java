public class Main{
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        JajarGenjang jg = new JajarGenjang();

        System.out.println("Segitiga");
        System.out.println("Keliling : " + sg.keliling(3));
        System.out.println("Luas     : " + sg.luas(3, 5));

        System.out.println();
        
        System.out.println("Jajar Genjang");
        System.out.println("Keliling : " + jg.keliling(3));
        System.out.println("Luas     : " + jg.luas(3, 5));
    }
}