package javaapplication1;

public class Main {
    public static void main(String[] args) {
        /*
         * PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
         * // IMuhendis muhendis1 = new PcMuhendisi(false, false); AYNI KULLANIM
         * 
         * muhendis1.askerlikDurumSorgula();
         * muhendis1.adliSicilSorgula();
         * System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
         * String[] tecrube = { "Vestel", "Havelsan", "Turksat" };
         * muhendis1.isTecrubesi(tecrube);
         */
        // IMuhendis muhendis1 = new PcMuhendisi(false, false); AYNI KULLANIM

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        String[] tecrube = {};
        String[] referans = { "Samet Özalp" };
        muhendis2.askerlikDurumSorgula();
        muhendis2.adliSicilSorgula();
        System.out.println(muhendis2.mezuniyetOrtalamasi(2.31));
        muhendis2.isTecrubesi(tecrube);
        muhendis2.referansGetir(referans);
        muhendis2.calis();
    }
}