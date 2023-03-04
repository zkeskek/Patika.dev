import java.util.Scanner;

/**
 * DikUcgendeHipotenusHesabi
 */
public class DikUcgendeHipotenusHesabi {

    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.println("a kenarını giriniz :");
        a=input.nextInt();
        System.out.println("b kenarını giriniz :");
        b=input.nextInt();
        c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs :"+c);
        double alan=(a*b)/2;
        System.out.println("Alan :"+alan);
        input.close();
    }
    
}