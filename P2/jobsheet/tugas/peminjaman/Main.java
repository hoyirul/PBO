public class Main{
    public static void main(String[] args) {
        Orders ord1 = new Orders();
        Orders ord2 = new Orders();

        // Member 1
        ord1.setIdMember("MB001");
        ord1.setNamaMember("Hairullah");

        // Game 1
        ord1.setIdGame("GM001");
        ord1.setNamaGame("PES 2021");
        ord1.setHarga(20000);

        ord1.setId(1);
        ord1.setLamaSewa(3);
        ord1.detailOrders();

        // Member 1
        ord2.setIdMember("MB002");
        ord2.setNamaMember("Elvira");

        // Game 1
        ord2.setIdGame("GM002");
        ord2.setNamaGame("Downhill 2021");
        ord2.setHarga(15000);


        ord2.setId(2);
        ord2.setLamaSewa(2);
        ord2.detailOrders();
    }
}