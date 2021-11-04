class Segitiga{
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB){
        double keliling = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        return keliling;
    }
}

public class Distpatch{
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Sudut A : " +  sg.totalSudut(30));
        System.out.println("Sudut A & B : " + sg.totalSudut(40, 90));
        System.out.println("Keliling : " + sg.keliling(10, 5, 15));
        System.out.println("Keliling : " + sg.keliling(10, 5));
    }
}