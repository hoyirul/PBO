public class Segitiga extends BangunDatar{
    // private float keliling, luas;

    public float keliling(int sisi){
        float keliling = sisi * 3;
        return keliling;
    }

    public float luas(int alas, int tinggi){
        float luas = alas * tinggi * 1/2;
        return luas;
    }
}