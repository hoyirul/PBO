public class Login implements IValidation{
    private String id, password;
    private boolean _login;
    private Pelanggan pelanggan;

    public Login(String id, String password){
        this.id = id;
        this.password = password;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan(){
        return pelanggan;
    }

    @Override
    public boolean loginProcess(){
        if(pelanggan.getID().equals(id) && pelanggan.getPassword().equals(password)){
            _login = true;
        }else{
            _login = false;
        }

        return _login;
    }

    @Override
    public void getErrors(){
        if(_login == true){
            System.out.println("Login Berhasil, Selamat Datang");
        }else{
            System.out.println("Login Gagal, Mohon cek ulang data anda");
        }
    }

    public void info(){
        if(_login == true){
            getErrors();
            pelanggan.info();
        }else{
            getErrors();
        }
    }
}