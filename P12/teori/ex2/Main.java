public class Main{
    public static void main(String[] args) {
        Manusia person = new Manusia();
        TelevisiJadul jadul = new TelevisiJadul();
        TelevisiModern modern = new TelevisiModern();

        person.nyalakanPerangkat(jadul);
        person.nyalakanPerangkat(modern);
    }
}