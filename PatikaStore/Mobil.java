package PatikaStore;

public class Mobil extends Store {
    
    private int kamera;
    private int pilGucu;
    private String renk;
    

    public Mobil() {
    }

    public Mobil(int kamera, int pilGucu, String renk) {
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.renk = renk;
      
    }

    public Mobil(int id, String urunName, double birimfiyat, String marka, int depolama, double ekranboyu, int ram,
            int kamera, int pilGucu, String renk ) {
        super(id, urunName, birimfiyat, marka, depolama, ekranboyu, ram);
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.renk = renk;
       
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

}
