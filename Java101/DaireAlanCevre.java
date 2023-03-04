import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.println("Daire yapıçapını giriniz");
        double cevre=2*pi*r;
        double alan=pi*r*r;
        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Dairenin Alanı: "+alan);
        input.close();
    }
}
