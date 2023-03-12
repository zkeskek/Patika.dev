package PatikaStore;

public class Store {
    private int id;
    private String urunName;
    private double birimfiyat;
    private String marka;
    private int depolama;
    private double ekranboyu;
    private int ram;

    public Store() {
    }

    public Store(int id, String urunName, double birimfiyat, String marka, int depolama, double ekranboyu, int ram) {
        this.id = id;
        this.urunName = urunName;
        this.birimfiyat = birimfiyat;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranboyu = ekranboyu;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunName() {
        return urunName;
    }

    public void setUrunName(String urunName) {
        this.urunName = urunName;
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranboyu() {
        return ekranboyu;
    }

    public void setEkranboyu(double ekranboyu) {
        this.ekranboyu = ekranboyu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    };

    

}
