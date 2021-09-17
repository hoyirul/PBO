public class TestKoperasi{
	public static void main(String[] args){
		Anggota donny = new Anggota("111333444", "Donny", 5000000);
		
		System.out.println("Nama Anggota: " + donny.getNama());
		System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
		
		System.out.println("\nMeminjam uang 10.000.000...");
		donny.pinjam(10000000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.println("\nMeminjam uang 4.000.000...");
		donny.pinjam(4000000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.println("\nMembayar angsuran 100.000");
		donny.angsur(100000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

		System.out.println("\nMembayar angsuran 400.000");
		donny.angsur(400000);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
	}
}