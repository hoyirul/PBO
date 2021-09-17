public class EncapTest{
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(14);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());

        System.out.println("----------------------");

        encap.setName("Randy");
        encap.setAge(19);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}