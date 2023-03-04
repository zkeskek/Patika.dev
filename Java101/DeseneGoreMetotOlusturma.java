import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    public static void desen(int n, int k) {

        System.out.print(n + " ");
        if (n <= 0) {
            k = k * -1;
        } else {
            desen(n - k, k);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Desen sayısını girin: ");
        int n = input.nextInt();
        int k = 5;

        desen(n, k);
    }
}
