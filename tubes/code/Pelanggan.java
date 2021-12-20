import java.util.Scanner;
public class Pelanggan extends Identitas{
    private String nama, alamat;
    private int umur;
    private Scanner sc = new Scanner(System.in);

    public Pelanggan(String nama, int umur, String alamat){
        System.out.println("-- Pelanggan --");
        System.out.print("Nama   : ");
        nama = sc.nextLine();
        System.out.print("Alamat : ");
        alamat = sc.nextLine();
        System.out.print("Umur   : ");
        umur = sc.nextInt();
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    @Override
    public void mempunyaiKTP(){
        if(umur >= 17){
            System.out.println(this.nama + " Mempunyai KTP");
        }else{
            System.out.println(this.nama + " Belum Mempunyai KTP");
        }
    }

    public void info(){
        System.out.println("-- Pelanggan --");
        System.out.println("Nama   : " + this.nama);
        System.out.println("Umur   : " + this.umur);
        System.out.println("Alamar : " + this.alamat);
    }
}