public class Main {
    public static void main(String[] args) {
        FinalTest f1 = new FinalTest("Ahmet");
        FinalTest f2 = new FinalTest("Samet");

        System.out.println("Obje sayısı: " + f1.objeSayisi);
        System.out.println("Obje sayısı: " + f2.objeSayisi);

        // f2.objeSayisi = 10; bu işlem yapılamaz

        Database database = new Database();
        database.baglantiKur("Samet", "123456");

    }
}
