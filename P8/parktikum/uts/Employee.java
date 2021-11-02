public class Employee{
    private String name, address, noTelp;
    private String username, password;
    public Employee(){}
    
    public Employee(String name, String noTelp, String address){
        this.name = name;
        this.noTelp = noTelp;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }

    public String getNoTelp(){
        return noTelp;
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

    public void info(){
        System.out.println("Employee");
        System.out.println("Name    : " + getName());
        System.out.println("No Telp : " + getNoTelp());
        System.out.println("Address : " + getAddress());
    }
}