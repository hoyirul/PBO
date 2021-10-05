public class MainPercobaan4{
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        
        // Ini telah dimodifikasi
        Penumpang budi = new Penumpang("12346", "Budi");
        Penumpang andi = new Penumpang("12347", "Andi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        // Ini telah dimodifikasi
        gerbong.setPenumpang(budi, 1);
        gerbong.setPenumpang(andi, 1);
        System.out.println(gerbong.info());
    }
}