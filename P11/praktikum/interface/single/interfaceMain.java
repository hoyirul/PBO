public class interfaceMain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        //Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        // sarjanaCumlaude.kuliahDiKampus();
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
