package Universite;
public abstract class Calisan {
    private String  adSoyad;
    private String  telefon;
    private String  eposta;

    
    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }


    public String getAdSoyad() {
        return adSoyad;
    }


    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }


    public String getTelefon() {
        return telefon;
    }


    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    public String getEposta() {
        return eposta;
    }


    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    public void giris(){
        System.out.println(this.adSoyad+" Üniversiteye giriş yaptı.");
    }
    public void giris(String s1){
        System.out.println(this.adSoyad+" Üniversiteye "+s1+" giriş yaptı.");
    }
    public void giris(String s1, String s2){
        System.out.println(this.adSoyad+" Üniversiteye "+s1+" giriş yaptı."+s2+" çıkış yaptı");
    }

    public void cikis(){
        System.out.println(this.adSoyad+" Üniversiteden cıkış yaptı.");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad+" Yemekhaneye giriş yaptı.");
    }
    
    public static void girisyapanlar(Calisan[] loginuser){
        for (Calisan c : loginuser) {
            c.giris();
        }
    }
}
