import java.util.Scanner;

public class KDVTutarHesabi {

    public static void main(String[] args) {
        double tutar, kdv, kdvOrani1 = 0.18, kdvOrani2 = 0.08;
        Scanner input = new Scanner(System.in);

        System.out.println("Tutarı giriniz :");
        tutar = input.nextDouble();

        if (0 <= tutar && tutar < 1000) {
            kdv = tutar * kdvOrani1;
            double sonuc = tutar + kdv;
            System.out.println("Tutar:" + tutar);
            System.out.println("KDV :" + kdv);
            System.out.println("Tutar+KDV :" + sonuc);

        } else if (tutar >= 1000) {
            kdv = tutar * kdvOrani2;
            double sonuc = tutar + kdv;
            System.out.println("Tutar:" + tutar);
            System.out.println("KDV :" + kdv);
            System.out.println("Tutar+KDV :" + sonuc);
        } else {
            System.out.println("Uygun değer giriniz");
        }
        input.close();
    }
}
