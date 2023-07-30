public class Main {
    public static void main(String[] args) {

        // INTERFACEDE ÖZELLİK EKLEME

        // static olmasa bile interfacede bu şekilde değişkene erişebiliriz
        System.out.println(IDeneme.a);
        System.out.println(IDeneme.c);

        // IDeneme.a = 1; DEĞİŞKENLERE DE MÜDAHALE EDEMİYORUZ FINAL OLMASA BILE

        // static olduğu için tanımlayabildik ve kullandık
        IDeneme.deneme();
    }
}
