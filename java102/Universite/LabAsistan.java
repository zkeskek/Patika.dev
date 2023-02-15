package Universite;

public class LabAsistan extends Asistan {

    public LabAsistan(String adSoyad, String telefon, String eposta, String ofisSaati) {
        super(adSoyad, telefon, eposta, ofisSaati);
    }
    
    public void lablaraGir(){
        System.out.println("lablara girildi");
    }
    public void derseGir(){
        System.err.println("Lab Asistan derse girdi.");
    }
    @Override
    public void giris(){
        System.out.println(getAdSoyad() +" Lab Asistanı Üniversiteye giriş yaptı.");
    }
}
