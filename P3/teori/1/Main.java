public class Main{
    public static void main(String[] args) {
        Kelas kls1 = new Kelas("K001", "1H");
        Ruang rg1 = new Ruang("R001", "LSI1", "Teori");
        kls1.addRuang(rg1);
        rg1.addKelas(kls1);

        // Kelas
        kls1.showData();

        System.out.println();
        
        // Ruang
        rg1.showData();
    }
}