import java.util.Scanner;


public class NotOrtalamasi {

   
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Matematik notunu giriniz : ");
        mat=input.nextInt();
        
        System.out.println("Fizik notunu giriniz : ");
        fiz=input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kim=input.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        tur=input.nextInt();

        System.out.println("Tarih notunu giriniz : ");
        tar=input.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        muz=input.nextInt();

        int toplam=mat+fiz+kim+tur+tar+muz;
        double ortalama=toplam/6;
              
        System.out.println(ortalama>=60? "Ortalama= "+ortalama+"Sınıfı Geçti":"Ortalama= "+ortalama+"Sınıfta Kaldı");

        input.close();

    }
}