package javaapplication1;

public class Monitor {

    private String model;
    private String uretici;
    private String boyut;

    private Resolution resolution;

    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void monitoruKapat() {
        System.out.println("Monitör kapatılıyor");
    }

}
