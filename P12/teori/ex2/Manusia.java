public class Manusia{
    public void nyalakanPerangkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input : DUI");
            System.out.println("voltase televisi : 220");
        }else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi jadul dengan input : HDMI");
            System.out.println("voltase televisi : 220");
        }
    }
}