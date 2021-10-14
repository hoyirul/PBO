public class Inheritance1{
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();
    }
}

/*
    JAWABAN 
    1. Superclass = Karyawan, Subclass = Manager, Staff
    2. extends
    3. Manager = Atributnya tunjangan
       Atribut yang diturunkan oleh Karyawan yaitu nama, alamat, jk, umur, gaji
    4. super.gaji pada class manager adalah Merujuk / memanggil konstruktor parent class /superclass Hanya bisa digunakan dibaris pertama dalam kontruktor
    5. Hierarchical Inheritance, karena kelas memiliki lebih dari satu kelas turunan (subclass) atau dengan kata lain, lebih dari satu kelas turunan memiliki kelas induk yang sama
*/