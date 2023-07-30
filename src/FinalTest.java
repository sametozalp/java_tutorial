public class FinalTest {

    // finaller ya başta tanımlanır ya da constructor içinde

    public final int objeSayisi;

    private static int say = 0;

    private final String isim;

    public FinalTest(String isim) {
        this.isim = isim;
        say++;
        objeSayisi = say; // bu şekilde finale değişebiliyor
    }
}
