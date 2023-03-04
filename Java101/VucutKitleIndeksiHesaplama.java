import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy,kilo,vucudKitleIndeksi;
        Scanner input=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz: ");
        boy=input.nextDouble(); 
        System.out.println("Kilonuzu giriniz: ");
        kilo=input.nextDouble();
        vucudKitleIndeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+vucudKitleIndeksi); input.close();
    }
}
