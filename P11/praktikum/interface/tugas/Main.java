public class Main{
    public static void main(String[] args) {
        Keledai kl = new Keledai("Keledai", 4, "Hehehehe", "Abu-abu");
        Gorilla gl = new Gorilla("Gorilla", 4, "Haum Haum", "Hitam Manis");
        Singa sg = new Singa("Singa", 4, "Roarr Roarr", "Coklat");

        kl.displayData();
        System.out.println();
        
        gl.displayData();
        System.out.println();
        
        sg.displayData();
        System.out.println();
    }
}