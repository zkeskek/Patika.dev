package Universite;
public class Patika {

    public static void main(String[] args) {
      Calisan c1=new Calisan("Ali", "1111 ", "a@as.com");
      c1.cikis();  

      Akademisyen a1=new Akademisyen("veli", "1231124", "a1@as.com", "mat", "prof");
      a1.giris();
      a1.getAdSoyad();
      a1.derseGir();

      Calisan m1=new Memur("Sami", "3234", "as@as.com", "bilgi işlem", "09-00");
      m1.cikis();
      //m1.calis(); Calışandan memur üretilirse memur metodlarına erişemez
     
      Memur m2=new Memur("Sami", "3234", "as@as.com", "bilgi işlem", "09-00");
      m2.calis();
      m2.calis();
      
      OgretimGorevlisi o1=new OgretimGorevlisi("Mahmut", "3223", "sdfsd", "fizik", "fizik ögret", "10");
      o1.derseGir();
      o1.giris();
      
      Asistan as1=new Asistan("Ömer", "6546", "vbcvb", "9:00");
      as1.getOfisSaati();
      as1.quizYap();

      BilgiIslem b1=new BilgiIslem("engin", "345435", "dfsd", "bilgi işlem", "9:00", "network");
      b1.giris();
      b1.networkKurulumu();
      b1.cikis();

      GuvenlikGorevlisi g1=new GuvenlikGorevlisi("demir", "43534", "fgfdd  ",  "güvenlik  ", "9:00 ", "Güvenlik belgesi");
      g1.calis();
      g1.cikis();
    }
}