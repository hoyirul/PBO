public class Customers{
    private String name, address;

    public Customers(){}
    
    public Customers(String name, String address){
        this.name = name;
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

    public void info(){
        System.out.println("Name    : " + getName());
        System.out.println("Address : " + getAddress());
    }
}