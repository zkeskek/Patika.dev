import java.util.Scanner;

/*Java ile mesafeye ve şartlara göre uçak bileti 
fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), 
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) 
bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. 
İlk olarak uçuşun toplam fiyatını hesaplayın 
ve sonrasında ki koşullara göre müşteriye 
aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, 
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya 
"Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı 
üzerinden %20 indirim uygulanır.
*/
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, ytip=0;
        double bucret = 0.1,toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz km: ");
        mesafe = input.nextInt();
        System.out.println("Yaşı giriniz");
        yas = input.nextInt();
        System.out.println("1-Tekyön,2-gidiş-dönüş Yolculuk tipini giriniz:");
        ytip = input.nextInt();
        if (mesafe > 0 && yas > 0 && (ytip == 1) || (ytip == 2)) {
        toplam=mesafe*bucret;
        double toplam1=toplam;
        if(yas<=12)toplam=toplam-toplam1*0.5;
        if(yas>12&&yas<24)toplam=toplam-toplam1*0.1;
        if(yas>=65)toplam=toplam-toplam1*0.3;
        if(ytip==2)toplam=toplam-toplam1*0.2;
        System.out.println("toplam tutar: "+toplam*2);
        
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        } 
        input.close();
    }
}
