import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        int n,r,nfak=1,rfak=1,nrfak=1;
        Scanner input=new Scanner(System.in);
        System.out.println("N giriniz: ");
        n=input.nextInt();
        System.out.println("R giriniz: ");

        r=input.nextInt();
        for(int i=1;i<=n;i++){
            nfak=nfak*i;
        }
        for(int i=1;i<=r;i++){
            rfak=rfak*i;
        }
        for(int i=1;i<=(n-r);i++){
            nrfak=nrfak*i;
        }
System.out.println("Kombinasyon: "+nfak/(rfak*nrfak));
input.close();
    }
}
