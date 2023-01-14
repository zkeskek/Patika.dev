import java.util.Scanner;

/**
 * SinifGecmeDurumu
 */
public class SinifGecmeDurumu {

    public static void main(String[] args) {
        double mat,fiz,kim,tur,muz,toplam=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Matematik notunu giriniz : ");
        mat=input.nextInt();
        
        System.out.println("Fizik notunu giriniz : ");
        fiz=input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kim=input.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        tur=input.nextInt();
        
        System.out.println("Müzik notunu giriniz : ");
        muz=input.nextInt();

        if((mat>=0)&&(mat<=100)){toplam=toplam+mat;}
        if((fiz>=0)&&(fiz<=100)){toplam=toplam+fiz;}
        if((kim>=0)&&(kim<=100)){toplam=toplam+kim;}
        if((tur>=0)&&(tur<=100)){toplam=toplam+tur;}
        if((muz>=0)&&(muz<=100)){toplam=toplam+muz;}
        

        double ortalama=toplam/5;
              
        if(ortalama>=55){
            System.out.println( "Ortalama= "+ortalama+" Sınıfı Geçti");
        }else{
            System.out.println("Ortalama= "+ortalama+" Sınıfta Kaldı");
        }
    }
}