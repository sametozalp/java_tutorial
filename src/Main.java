public class Main {
    public static void main(String[] args) {

        // LOCAL INNER CLASSES - public, static anahtar kelimelerini kullanamıyoruz.

        class Alan {
            public void daireAlan() {
                System.out.println("daire alan fonk");
            }
        }

        Alan alan = new Alan();
        alan.daireAlan();

        // public veya static anahtar kelimelerini kullanamıyoruz
        // ayrıca farklı bir fonk içerisinden de bu classa ulaşamıyoruz
        /*
         * public class Alane {
         * public void daireAlan() {
         * System.out.println("daire alan fonk");
         * }
         * }
         */

    }
}
