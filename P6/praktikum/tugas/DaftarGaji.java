public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int j = 0;
   
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
   
    public void addPegawai(Pegawai p){
        listPegawai[j] = p;
        j++;
    }
   
    public void printSemuaGaji(){
        for (int i=0;i<j;i++){
            System.out.print(listPegawai[i].getNama()+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}