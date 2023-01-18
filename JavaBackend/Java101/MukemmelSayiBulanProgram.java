import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        int n, sayi, bolen, bolenToplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz :");
        n = input.nextInt();
        for (int j = 1; j <= n; j++) {
            sayi = j;
            for (int i = 1; i <sayi; i++) {

                if (sayi % i == 0) {
                    
                    bolenToplam = bolenToplam +i;

                }

            }
            
            if (sayi == bolenToplam) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            }
bolenToplam=0;
        }
    }
}
