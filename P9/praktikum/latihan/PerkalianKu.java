public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

// 	Terletak pada method perkalian karena memiliki aturan yang sama dengan overloading yaitu nama method yang sama dan daftar parameter yang berbeda,
// 	Terdapat 2 paramater yang berbeda yaitu (int a, int b) dan (int a, int b, int c).
