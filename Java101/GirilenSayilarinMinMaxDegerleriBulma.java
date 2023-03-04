import java.util.Random;
import java.util.Scanner;
public class GirilenSayilarinMinMaxDegerleriBulma {
    public static void main(String[] args) {
        int n,sayi,enbuyuk,enkucuk;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        n=input.nextInt();
        Random rand = new Random();
        sayi=rand.nextInt(1000);
        enbuyuk=sayi;
        enkucuk=sayi;
        System.out.println("1. Sayı: "+sayi);
        
        for(int i=2;i<=n;i++){
            
            sayi=rand.nextInt(1000);
            if(sayi>enbuyuk){
                enbuyuk=sayi;
                
            }else if(sayi<enkucuk){
                enkucuk=sayi;
            }
            System.out.println(i+". Sayı: "+sayi);
        }
        System.out.println("En Büyük Sayı: "+enbuyuk+"\nEn Küçük Sayı: "+enkucuk);
        input.close();
    }
}
