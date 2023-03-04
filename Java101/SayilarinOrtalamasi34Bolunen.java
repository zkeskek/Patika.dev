import java.util.Scanner;

public class SayilarinOrtalamasi34Bolunen {
    public static void main(String[] args) {
        int n, x = 0, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("3 ve 4 e bölünen sayılar: ");
        for (int i = 1; i <n; i++) {
           if ((i % 4==0)&&(i % 3==0)) {
                System.out.print(i + " ");
                toplam = toplam + i;
                x = x + 1;
            }
                      
        }
        System.out.println();
        if (x > 0) {
            System.out.println("3 ve 4 e bölünen Sayıların ortalaması: " + (toplam / x));
        } else {
            System.out.println("3 ve 4 e bölünen Sayıların ortalaması: " + (0));
        }
        input.close();
    }
}
