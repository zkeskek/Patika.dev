import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        c = input.nextInt();

        if (b < a && b > c) {
            System.out.println(c + " " + b + " " + a);
        }
        if (a < b && c > b) {
            System.out.println(a+ " " + b + " " + c);
        }
        if (c < a && c > b) {
            System.out.println(b+ " " + c + " " + a);
        }
        if (a < c && b > c) {
            System.out.println(a+ " " + c + " " + b);
        }
        if (a < b && a > c) {
            System.out.println(c + " " + a + " " + b);
        }
        if (b< a && c > a) {
            System.out.println(b + " " + a + " " + c);
        }
        input.close();
    }

}
