import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int sayi,us,sonuc=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi=input.nextInt();
        System.out.println("Üssü giriniz: ");
        us=input.nextInt();
        for(int i=1;i<=us;i++){
        sonuc=sonuc*sayi;
        }
        System.out.println(sayi+" "+us+". kuvveti : "+sonuc);
    }
}
