public class Main{
    public static void main(String[] args) {
        Owner owner = new Owner("Elvira", "Kediri");
        Products p = new Products();
        Products p1 = new Products("iPhone 12", "iPhone", 499);
        Products p2 = new Products("iPhone 13", "iPhone", 699);
        Products p3 = new Products("Macbook Pro M1", "Mac", 1499);
        p.setOwner(owner);
        p1.setOwner(owner);
        p2.setOwner(owner);
        p3.setOwner(owner);

        // User with login
        Customers cust1 = new Customers("Hairullah", "Bondowoso");
        Users user1 = new Users("user", "user", "customer");
        user1.setCustomers(cust1);
        Auth auth1 = new Auth();
        Orders ord1 = new Orders();

        auth1.setUsers(user1);
        auth1.setUsername("user");
        auth1.setPassword("user");
        auth1.authLog();
        auth1.getErrors();
        ord1.setOrderid("OR001");
        ord1.setAuth(auth1);
        ord1.setProduct(p2);
        ord1.setQty(2);
        ord1.info();

        // user without login

        System.out.println("---------------------------------------");
        System.out.println("User without login");
        Customers cust2 = new Customers("Sania Mufida", "Kediri");
        Users user2 = new Users("sania", "1234", "customer");
        user2.setCustomers(cust2);
        Auth auth2 = new Auth();
        Orders ord2 = new Orders();

        auth2.setUsers(user2);
        auth2.setUsername("user");
        auth2.setPassword("user");
        // auth2.authLog();
        auth2.getErrors();
        ord2.setOrderid("OR001");
        ord2.setAuth(auth2);
        ord2.setProduct(p3);
        ord2.setQty(1);
        ord2.info();
    }
}