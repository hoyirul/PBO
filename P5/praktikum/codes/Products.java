public class Products{
    private String name, type;
    private double price;
    private Owner owner;

    public Products(){}
    
    public Products(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
        this.owner = null;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void info(){
        owner.info();
        System.out.println("-------------------------------");
        System.out.println("Name    : " + getName());
        System.out.println("Type    : " + getType());
        System.out.println("Price   : $ " + getPrice());
    }
}