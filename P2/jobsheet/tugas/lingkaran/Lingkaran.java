public class Lingkaran{
    public double phi;
    public double r;

    public double hitungLuas(){
        if(r % 7 == 0){
            phi = 22/7;
        }else{
            phi = 3.14;
        }
        double luas = phi * (r * r);
        return luas;
    }

    public double hitungKeliling(){
        if(r % 7 == 0){
            phi = 22/7;
        }else{
            phi = 3.14;
        }
        double kel = phi * r * 2;
        return kel;
    }
}