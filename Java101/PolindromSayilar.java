import java.util.Scanner;

public class PolindromSayilar {
    public static void main(String[] args) {
        int n, dn, sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        n = input.nextInt();
       

        for (int i = 1; i <= n; i++) {
            sayi = i;
            dn = 0;
            while (sayi > 0) {
                int temp = sayi % 10;
                sayi = sayi / 10;
                dn = dn * 10 + temp;
            }
            if (dn == i) {
                System.out.println(i + " sayısı polindrom bir sayıdır");
            }
        }
        input.close();
    }
}
