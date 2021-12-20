import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static String id, password;
    static int nav, lama, pil;
    static Pelanggan pelanggan[] = new Pelanggan[3];
    static Pemilik pemilik = new Pemilik("Ferdi", 20, "Probolinggo");
    static Login login = new Login(null, null);
    static Merk merk1 = new Merk("BMX 2", 2015);
    static Merk merk2 = new Merk("Polygon", 2018);
    static Sepeda sb = new SepedaBiasa("Ransi 09", 8500, "Biasa", "Hitam");
    static Sepeda sg = new SepedaGunung("Monarc 5", 12500, "Gunung", "Coklat");
    public static void main(String[] args) {
        pemilik.setID("P0001");
        pemilik.setPassword("12345678");

        if(login.isLogin() == false){
            System.out.println("Anda Harus login");
            login();
        }else{
            navigasi();
        }
    }

    public static void login(){
        System.out.println("-- Login Page --");
        System.out.print("ID Pemilik : ");
        id = sc.nextLine();
        System.out.print("Password   : ");
        password = sc.nextLine();
        // sc.next();

        if(id.equals("") && password.equals("")){
            System.out.println("ID dan Password harus diisi!");
            login();
        }else{
            login = new Login(id, password);
            login.setPemilik(pemilik);            
            if(login.loginProcess() == true){
                navigasi();
            }else{
                login.getErrors();
                login();
            }
        }
    }

    public static void navigasi(){
        System.out.println("---- Aplikasi Sewa Sepeda ----");
        System.out.println("1. Data Pemilik");
        System.out.println("2. Data Sepeda");
        System.out.println("3. Transaksi");
        System.out.println("4. Keluar");
        System.out.print("o> ");
        nav = sc.nextInt();

        switch(nav){
            case 1:
                pemilik.info();
                System.out.println();
                navigasi();
                break;
            case 2:
                dataSepeda();
                navigasi();
                break;
            case 3:
                Pelanggan pelanggan = new Pelanggan("", 0, "");
                System.out.println("--- Pilih Tipe Sepeda ---");
                dataSepeda();

                System.out.print("o> ");
                pil = sc.nextInt();
                System.out.print("Lama Sewa (perjam) : ");
                lama = sc.nextInt();

                Harga price = new Harga();
                int randID = (int)Math.floor(Math.random()*(1000-0+1)+0);
                Transaksi tr = new Transaksi("OR" + randID);
                tr.setPelanggan(pelanggan);
                tr.setLamaSewa(lama);
                tr.setUser(login);
                tr.setHarga(price);
                if(pil == 1){
                    tr.info(sb);
                }else{
                    tr.info(sg);
                }
                navigasi();
                break;
            case 4:
                login = new Login(null, null);
                sc.nextLine();
                if(login.isLogin() == true){
                    navigasi();
                }else{
                    login();
                }
                break;
            default:
                System.out.println("-----------------");
                System.out.println("Pilihan Tidak ada");
                System.out.println("-----------------");
                navigasi();
        }
    }

    static void dataSepeda(){
        sb.setMerk(merk1);
        sg.setMerk(merk2);

        System.out.println("1. Sepeda Biasa");
        sb.info();
        System.out.println();

        System.out.println("2. Sepeda Gunung");
        sg.info();
    }
}