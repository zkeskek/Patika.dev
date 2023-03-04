import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        int son,sayi, toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi girin: ");
        son = input.nextInt();
        for(int j=1;j<=son;j++){
            sayi=j;
        int toplam1=0;
        for (int i = 1; i < sayi; i++) {
            int temp = sayi;
            toplam=0;
           
            while (temp > 0) {
                toplam = toplam + (int) Math.pow((temp % 10),i) ;
                temp=(int)(temp/10);
                
                
                
            }
            
            if(toplam>sayi||toplam==toplam1){
                //System.out.println(sayi+" Armstrong Sayı değildir");
                break;
            }
            toplam1=toplam;
            if(toplam==sayi){
                System.out.println(sayi+" Sayi Armstrong Sayıdır");
            }
            input.close();
        }
    }

    }
}
