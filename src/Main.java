public class Main {
    public static void main(String[] args) {

        //Sekil sekil = new Sekil(); KULLANAMIYORUZ

        Kare kare = new Kare("kare", 5);
        Daire daire = new Daire("daire", 3); 
        kare.alanHesapla();
        daire.alanHesapla();
        kare.cevreHesapla();
    }
}
