public class Percobaan3{
    public static void main(String[] args) {
        Tabung tabung = new Tabung();

        tabung.setSuperPhi(3.14);
        tabung.setSuperR(10);
        tabung.setT(3);
        tabung.volume();
    }
}

/*
no 1. super adalah merepresentasikan objek dari class induk.
no 2. super adalah untuk merepresentasikan objek dari class induk 
      dan this di pake merepresentasikan objek dari class itu sendiri
no 3. karena class Tabung adalah subclass dari class Bangung jadi atribut class Bangun(parent class)
      bisa di akse oleh class Tabung
*/