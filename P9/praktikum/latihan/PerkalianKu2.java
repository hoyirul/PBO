public class PerkalianKu2 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian((int) 34.56, (int) 23.7);
    }
}

// 	pada method perkalian karena memiliki aturan yang sama dengan overloading yaitu nama method yang sama dan daftar parameter yang berbeda,
// 	Terdapat 2 paramater yang berbeda yaitu (int a, int b) dan (double a, double b). Karena perbedaan daftar parameter bukan hanya terjadi pada perbedaan banyaknya parameter, tetapi juga urutan dari parameter tersebut.