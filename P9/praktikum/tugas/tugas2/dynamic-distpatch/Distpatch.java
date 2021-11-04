class Manusia{
    public void bernafas(){
        System.out.println("Manusia harus bernapas");
    }

    public void makan(){
        System.out.println("Manusia harus makan");
    }
}

class Dosen extends Manusia{
    @Override
    public void makan(){
        System.out.println("Dosen harus makan");
    }

    public void lembur(){
        System.out.println("Dosen bisa lembur");
    }
}

class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("Mahasiswa harus makan");
    }

    public void tidur(){
        System.out.println("Mahasiswa harus tidur");
    }
}

public class Distpatch{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen ds = new Dosen();

        mhs.bernafas();
        mhs.makan();
        mhs.tidur();

        System.out.println();

        ds.bernafas();
        ds.makan();
        ds.lembur();
    }
}