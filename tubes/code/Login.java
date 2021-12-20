public class Login implements IValidation{
    private String id, password;
    private boolean _login;
    private Pemilik pemilik;

    public Login(){}

    public Login(String id, String password){
        this.id = id;
        this.password = password;
    }

    public void setPemilik(Pemilik pemilik){
        this.pemilik = pemilik;
    }

    public Pemilik getPemilik(){
        return pemilik;
    }

    @Override
    public boolean loginProcess(){
        if(pemilik.getID().equals(id) && pemilik.getPassword().equals(password)){
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

    public boolean isLogin(){
        return _login;
    }

    public void info(){
        if(_login == true){
            getErrors();
            pemilik.info();
        }else{
            getErrors();
        }
    }
}