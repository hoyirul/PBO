public class Main{
    public static void main(String[] args) {
        Mac mac = new Mac("Macbook Pro", 7443, 16, "M1 Chip", "Polimer Litium", "Big Sur");
        mac.tampilMac();

        Windows windows = new Windows("Surface Pro", 7200, 16, "Intel Core i9", "Polymer", "Touch Screen");
        windows.tampilWindows();

        PC pc = new PC("Asus Gaming", 7120, 32, "AMD Ryzen 9", 32);
        pc.tampilPc();
    }
}