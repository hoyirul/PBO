public class Motor{
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if(kontakOn == true){
            if(kecepatan >= 100){
                System.out.println("Mohon maaf kecepatan maksimal hanya 100KM \n");
            }else{
                kecepatan += 5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!! \n");
        }
    }

    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off!! \n");
        }
    }

    public void printStatus(){
        if(kecepatan >= 100){
            System.out.println("Turunin kecepatan, kecepatan sudah maksimal \n");
        }else{
            if(kontakOn == true){
                System.out.println("Kontak On");
            }else{
                System.out.println("Kontak Off");
            }
            System.out.println("Kecepatan " + kecepatan + "\n");
        }
    }
}