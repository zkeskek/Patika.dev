import java.util.Scanner;

public class Basamaksayilarinintoplami {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi=input.nextInt();
        while(sayi>0){
            toplam=toplam+sayi%10;
            sayi=(int)sayi/10;

        }
        System.out.println("Sayının basamak sayılarının toplamı: "+toplam);
    }
}
