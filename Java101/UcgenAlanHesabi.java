import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("a kenarını giriniz :");
        a=input.nextInt();
        System.out.println("b kenarını giriniz :");
        b=input.nextInt();
        System.out.println("c kenarını giriniz :");
        c=input.nextInt();
        int UcgenCevresi=a+b+c;
        double u=UcgenCevresi/2;
        
        System.out.println("Üçgenin Çevresi :"+UcgenCevresi);
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan :"+alan); input.close();
    }
}
