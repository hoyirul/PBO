public class interfaceMain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

//        =========== MAIN PERCOBAAN 2 ============
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masterCum);

//        IBerprestasi prestasi = new IBerprestasi();

//        =========== MAIN PERCOBAAN 1 ============
//        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
//        Sarjana sarjanaCumlaude = new Sarjana("Dini");
//        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
//        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakrektor.beriSertifikatCumlaude(masterCumlaude);
//          Jawaban No 4 Percobaan 1
//        System.out.println("-----");
//        sarjanaCumlaude.kuliahDiKampus();
    }
}
