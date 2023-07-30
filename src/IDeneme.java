public interface IDeneme {

    // interface içerisinde private alan tanımlayamıyoruz. dolayısıyla da getter ve
    // setter metotları kullanılamaz

    public int a = 4;

    // static kullanmamıza gerek yok çünkü zaten staticmiş gibi çalışıyorlar
    public int b = 5;

    // buraya constructorda yazılamaz
    public final int c = 6;

    // AYRICA STATIC TANIMLANMASI SARTIYLA METOT YAZABILIYORUZ
    public static void deneme() {
        System.out.println("deneme yazısı");
    }
}
