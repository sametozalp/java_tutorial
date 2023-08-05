import java.io.Serializable;

public class Ogrenci implements Serializable {

    // Serializable içerisinde herhangi bir metot bulunmaz. Sadece javaya
    // serileştireceğimizi bildiririz.

    // private static final long serialVersionUid = 1000;
    // classı değiştirdiğinde bu şekilde bir güvenlik atamalısın ki başka bir
    // cihazda eski bir sürüme entegre etmeye çalışıldığında hata versin ve güvenlik
    // açığı oluşmasın.

    private String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi: " + isim
                + "\nÖğrenci Numarası: " + id
                + "\nÖğrenci Bölüm: " + bolum;

        return bilgiler;
    }

}
