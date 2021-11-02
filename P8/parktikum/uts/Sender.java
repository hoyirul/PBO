public class Sender{
    private String name, address, noTelp;

    public Sender(){}
    
    public Sender(String name, String noTelp, String address){
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

    public void info(){
        System.out.println("Sender");
        System.out.println("Name    : " + getName());
        System.out.println("No Telp : " + getNoTelp());
        System.out.println("Address : " + getAddress());
    }
}