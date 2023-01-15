import java.util.Scanner;

public class EBOBEKOKBulanProgram {
    public static void main(String[] args) {
        int sayi1, sayi2, obeb=1, okek=1;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı 1 i giriniz :");
        sayi1 = input.nextInt();
        System.out.println("Sayı 2 yi giriniz :");
        sayi2 = input.nextInt();

        for (int i = 2; i <= (int) (sayi1 / 2) && i <= (int) (sayi2 / 2); i++) {
            int obeb1 = 1, obeb2 = 1;
            if (sayi1 % i == 0) {
                System.out.println("1. sayı böleni: " + i);
                obeb1 = i;
            }
            if (sayi2 % i == 0) {
                System.out.println("2. sayı böleni: " + i);
                obeb2 = i;

            }
            
            
            if (obeb1 == obeb2 && obeb1 != 1) {

                obeb = obeb1;
                
            } 

        }
okek=sayi1*sayi2/obeb;
        System.out.println("obeb: " + obeb);
        System.out.println("okek: " + okek);
    }
}
