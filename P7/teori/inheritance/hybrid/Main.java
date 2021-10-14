public class Main{
    public static void main(String[] args) {
        HewanMamalia hm1 = new HewanMamalia();
        hm1.setNama("Kucing");
        hm1.info();

        System.out.println();
        HewanMamalia hm2 = new HewanMamalia();
        hm2.setNama("Anjing");
        hm2.info();

        HewanReptil hr1 = new HewanReptil();
        hr1.setNama("Ular");
        hr1.info();

        System.out.println();
        HewanReptil hr2 = new HewanReptil();
        hr2.setNama("Buaya");
        hr2.info();

    }
}