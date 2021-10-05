public class Orders{
    private String orderid;
    private Products product;
    private Auth user;
    private double total;
    private int qty;

    public Orders(){}

    public void setOrderid(String orderid){
        this.orderid = orderid;
    }

    public String getOrderid(){
        return orderid;
    }

    public void setProduct(Products product){
        this.product = product;
    }

    public Products getProduct(){
        return product;
    }

    public void setAuth(Auth user){
        this.user = user;
    }

    public Auth getAuth(){
        return user;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public int getQty(){
        return qty;
    }

    public double total(){
        return total = getQty() * product.getPrice();
    }

    public void info(){
        if(user.authLog() == true){
            System.out.println("Customer");
            user.info();
            product.info();
            System.out.println("-------------------------------");
            System.out.println("Total   : $ " + total());
            System.out.println("-------------------------------");
        }else{
            System.out.println("Mohon maaf, anda belum login!!");
        }
    }
}