public class Ponsel extends Handphone implements IKomunikasi{
    @Override
    public void panggilanTelfon(){
        System.out.println("Ponsel dapat menerima dan menelfon.");
    }

    @Override
    public void mengirimSMS(){
        System.out.println("Ponsel dapat mengirim dan menerima SMS (pesan).");
    }
}