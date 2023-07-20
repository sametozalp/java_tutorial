package javaapplication1;

public class Bilgisayar {
    
    private Monitor monitor;
    private Kasa kasa;
    private Anakart anakart;

    public Bilgisayar (Monitor monitor, Kasa kasa, Anakart anakart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

}
