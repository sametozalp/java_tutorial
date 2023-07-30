public class Kapsam {
    private int degisken = 30;

    public class Dahili {
        private int degisken = 20;
        private int a = 5;

        public void degiskenKullan() {
            int degisken = 10;

            System.out.println(Kapsam.this.degisken); // !!!
        }

        // this mevcut sınıfa referans verir. eğer bir üst classa referans istiyorsak
        // sınıf adını kullanıp .this demeliyiz
    }

    // her ne kadar a değişkeni private olsa da ikisinin de Kapsam sınıfı içinde
    // olmasından dolayı a değişkenini private olmasına rağmen kullanabilir
    public void dahiliKontrol() {
        Dahili d = new Dahili();
        System.out.println(d.a);
    }
}
