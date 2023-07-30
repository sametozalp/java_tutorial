package com.sametozalp.paket1;

public class Main {
    public static void main(String[] args) {

        // ACCESS MODIFIERS (ERISIM BERLIRLEYICILER)

        // 4 çeşit erişim belirleyici var : public, private, protected, default

        // private ve protected classlar için kullanılamaz

        // bir class public olarak yazılırsa hem paket içinden hem paket dışından
        // erişilebilir

        // erişim belirleyicisi kullanılmadan yazılan bir classa (default) sadece aynı
        // paket
        // içerisinden erişebiliriz

        // default olarak yazılmış bir değişkene KENDİ PAKETİNDEN her yerden
        // ulaşabiliyoruz

        // protectedda aynı paket içi erişebiliyor, paketin dışındakiler ise alt
        // classıysa bu alanlara erişebiliyoruz

        // access modifier fonksiyonların değişkenlerinde kullanılmaz
    }
}