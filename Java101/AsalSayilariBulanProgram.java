import java.util.Scanner;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {
        int n;
        boolean asal = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            asal = true;
            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if(asal) System.out.println(i+" Asal sayıdır.");
        }
        input.close();
    }
}
