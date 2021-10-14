public class Inheritance1{
    public static void main(String[] args) {
        StaffTetap ST= new StaffTetap("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 200000, "2", 100000);
        ST.tampilStaffTetap();
        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian ();
    }
}

/* 
    JAWABAN
    1. Single Inheritance -> Karyawan dan Manager
       Multilevel Inheritance -> Karyawan, Staff, StaffHarian dan StaffTetap
    2. Atribut StaffHarian = jmlJamKerja
       Atribut StaffTetap  = golongan dan asuransi
       Atribut yang diturunkan dari class Staff = lembur dan potongan
    3. Fungsinya adalah Merujuk / memanggil konstruktor parent class /superclass Hanya bisa digunakan dibaris pertama dalam kontruktor
       atau bisa dibilang bahwa class Karyawan menurunkan atribut ke Staff dan Staff menurunkan ke StaffHarian dan StaffTetap
    4. super.tampilDataStaff() adalah memanggil method dari parent class
    5. Karena class StaffTetap diwarisi atribut oleh parent classnya
*/