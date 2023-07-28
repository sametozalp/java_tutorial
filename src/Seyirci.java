public class Seyirci {
    private String isim;
    private static int seyirciSayisi = 0;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }
    
    public void oyunIzle() {
        System.out.println(isim + " oyun izliyor.");
    }
    public int getSeyirciSayisi() {
        return seyirciSayisi;
    }
}
