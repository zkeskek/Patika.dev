package Universite;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
    public void senatoToplantisi(){
        System.out.println("Toplantı yapıldı");
    }
    public void sinavYap(){
        System.out.println("Sınav yapıldı");
    }
    
}
