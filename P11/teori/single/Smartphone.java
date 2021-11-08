public class Smartphone extends Handphone implements IKomunikasi{
    @Override
    public void panggilanTelfon(){
        System.out.println("Smartphone dapat menerima dan menelfon.");
    }

    @Override
    public void mengirimSMS(){
        System.out.println("Smartphone dapat mengirim dan menerima SMS (pesan).");
    }
}