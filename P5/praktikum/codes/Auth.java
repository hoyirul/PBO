public class Auth{
    private boolean _login = false;
    private String username, password;
    private Users users;
    
    public Auth(){}

    public void setUsers(Users users){
        this.users = users;
    }

    public Users getUsers(){
        return users;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public boolean authLog(){
        if(username.equals(users.getUsername()) && password.equals(users.getPassword())){
            _login = true;
        }else{
            _login = false;
        }

        return _login;
    }

    public void info(){
        if(_login == true){
            getErrors();
            users.info();
        }else{
            getErrors();
        }
    }

    public void getErrors(){
        if(_login == true){
            System.out.println("Login Berhasil, Selamat Datang");
        }else{
            System.out.println("Login Gagal, Mohon cek ulang data anda");
        }
    }
}