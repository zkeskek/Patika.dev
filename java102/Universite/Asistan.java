package Universite;

public class Asistan extends Calisan{
    private String ofisSaati;
    public Asistan(String adSoyad, String telefon, String eposta, String ofisSaati) {
        super(adSoyad, telefon, eposta);
        this.ofisSaati=ofisSaati;
    }
    public String getOfisSaati() {
        return ofisSaati;
    }
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
   
    public void quizYap(){
        System.out.println("quiz yapıldı.");
    }
    
    
    
    
}
