public class Windows extends Leptop{
    public String fitur;

    public Windows(){}

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("--------------- Leptop Windows -----------------");
        super.tampilLeptop();
        System.out.println("Fitur               : " + fitur);
        System.out.println();
    }
}