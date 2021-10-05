public class Owner{
    private String name, address;

    public Owner(){}
    
    public Owner(String name, String address){
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
        System.out.println("OWNER");
        System.out.println("Name    : " + getName());
        System.out.println("Address : " + getAddress());
    }
}