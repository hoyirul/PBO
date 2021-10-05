public class Users{
    private String username, password, level;
    private Customers customers;

    public Users(){}

    public Users(String username, String password, String level){
        this.username = username;
        this.password = password;
        this.level = level;
        this.customers = null;
    }

    public void setCustomers(Customers customers){
        this.customers = customers;
    }

    public Customers getCustomers(){
        return customers;
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

    public void setLevel(String level){
        this.level = level;
    }

    public String getLevel(){
        return level;
    }

    public void info(){
        customers.info();
        System.out.println("Level   : " + getLevel());
    }
}