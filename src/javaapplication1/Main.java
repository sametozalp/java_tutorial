package javaapplication1;

public class Main {

    public static void main(String[] args) {
        
        // Kedi referansını üst sınıfa eşitleyebiliyoruz
        // Buna POLYMORPHISM denir.
        // (Kalıtım olmak durumunda)
        // Tür dönüşümü olmadan parametre olarak yollayabiliyoruz, bu bir avantaj.
        
        Hayvan hayvan1 = new Hayvan();
        hayvan1.hayvanKonusuyor();
        
        Hayvan hayvan2 = new Kedi("Tekir");
        hayvan2.hayvanKonusuyor();
        
        // hayvan2 referansı Kedi sınıfından mıdır ?
        if(hayvan2 instanceof Kedi){
            System.out.println("hayvan2 Kedi referansindandir.");
        }
    }
}

// public yazarsak dosya adıyla aynı olmak zorunda
class Hayvan {
    
    private String isim;

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void hayvanKonusuyor (){
        System.out.println("Hayvan konusuyor..");
    }
    
}
 class Kedi extends Hayvan {
     private String isim;
     
     public Kedi(String isim) {
         this.isim = isim;
     }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
     
     @Override
     public void hayvanKonusuyor(){
         System.out.println(this.isim + " miyavliyor..");
     }
 }