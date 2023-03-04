import java.util.Scanner;

public class JavaPatika {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Toplamayı bitirmek için 0 sayısı giriniz.");
        while (true) {

            System.out.print(i++ + ". sayı :");

            number = scan.nextInt();

            if (number == 0) {
                break;
            }
            result += number;
            System.out.println("toplam : " + result);
        }
        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
            System.out.println("Sonuç : " + result);
        }

        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
            System.out.println("Sonuç : " + result);
        }

        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
            System.out.println("Sonuç : " + result);
        }

        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
            System.out.println("Sonuç : " + result);
        }

        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

        }

        System.out.println("Sonuç : " + result);
        scan.close();
    }

    static void mod() {
        int number, mod;
        Scanner scan = new Scanner(System.in);
        System.out.print("Mod alınacak sayı giriniz :");
        number = scan.nextInt();
        System.out.print("Mod değerini giriniz :");
        mod = scan.nextInt();
        int result = number % mod;
        System.err.println("Mod işlemi sonucu: " + result);
        scan.close();
    }

    static void Dikdortgen() {
        int high, wide,alan,cevre;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin enini giriniz :");
        wide = scan.nextInt();
        System.out.print("Dikdörtgenin boyunu giriniz :");
        high = scan.nextInt();
        alan = wide*high;
        cevre=2*(wide+high);
        System.out.println("Dikdörtgenin alanı : "+alan);
        System.out.println("Dikdörtgenin çevresi : "+cevre);
        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    Dikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

        scan.close();
    }
}