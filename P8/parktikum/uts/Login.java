public class Login{
    private boolean _login = false;
    private String username, password;
    private Employee employee;
    
    public Login(){}

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee(){
        return employee;
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
        if(username.equals(employee.getUsername()) && password.equals(employee.getPassword())){
            _login = true;
        }else{
            _login = false;
        }

        return _login;
    }

    public void info(){
        if(_login == true){
            getErrors();
            employee.info();
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