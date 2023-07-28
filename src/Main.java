public class Main {
    public static void main(String[] args) {

        // INNER CLASSES

        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();

        asal.asalMi();
        factorial.factorial();
        alan.daireAlan();

    }
}
