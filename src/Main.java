
import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {

        // paketleri container görevi görür
        // farklı classlarda aynı isimler olsa bile biz farklı paket isimleri verdiğimiz
        // takdirde bunlar birbirine karışmıyor

        Node node = null;

        // iki paketi bu şekilde dahil edip kullanamayız ancak şu şekilde yapılabilir.
        // javax.xml.soap.Node node2 = null; (paketi bulamadı ama mantık bu)

        // farklı paketteki classlara erişmeki için o paketi import etmek gerekiyor

        // kendi yazdığımız classı jar olarak dışarı çıkıp farklı projelere ekleyip
        // kullanabiliyoruz

    }
}