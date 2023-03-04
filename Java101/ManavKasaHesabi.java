import java.util.Scanner;

/**
 * ManavKasaHesabi
 */
public class ManavKasaHesabi {

    public static void main(String[] args) {
        double armutKgf=2.14,elmakgf=3.67,domateskgf=1.11,muzkgf=0.95,patlicanKgf=5;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("Armut kaç kilo?");
        armutKg=input.nextInt();
        System.out.println("Elma kaç kilo?");
        elmaKg=input.nextInt();
        System.out.println("Domates kaç kilo?");
        domatesKg=input.nextInt();
        System.out.println("Muz kaç kilo?");
        muzKg=input.nextInt();
        System.out.println("Patlıcan kaç kilo?");
        patlicanKg=input.nextInt();
        double toplam=armutKgf*armutKg+elmakgf*elmaKg+domateskgf*domatesKg+muzkgf*muzKg+patlicanKgf*patlicanKg;
        System.out.println("Toplam Tutar: "+toplam+" TL");

        input.close();
    }
}