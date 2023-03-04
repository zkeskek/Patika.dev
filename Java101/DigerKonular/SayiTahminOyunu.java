import java.util.Scanner;

/**
 * SayiTahminOyunu
 */
public class SayiTahminOyunu {

    public static void main(String[] args) {
        System.out.println("Sayı Tahmini oyununa hoş geldiniz.");
        
        Scanner input = new Scanner(System.in);
        int sayi = (int) (Math.random() * 100);
        int hak = 7;
        boolean isWin = false;
        while (true) {
            System.out.print("0 ile 100 dahil arasında bir sayı giriniz. ");
            int x = input.nextInt();
            if (x < sayi) {
                hak = hak - 1;
                System.out.println("Sayı " + x + " sayısından büyük");
                System.out.println(hak + " hakkınız kaldı");
                
            }
            if (x == sayi) {
                System.out.println("Tebrikler. Sayıyı buldunuz.");
                isWin = true;
            }
            if (x > sayi) {
                hak = hak - 1;
                System.out.println("Sayı " + x + " sayısından küçük");
                System.out.println(hak + " hakkınız kaldı");
                
            }
            if (hak <= 0) {
                
                System.out.println("Oyunu kaybettiniz");
                              

            }
            if(hak<=0||isWin){
                System.out.println("Tekrar oynamak isterseniz 'E' tuşuna basınız.");
                System.out.println("Oyundan çıkmak için herhangi bir tuşa basınız.");
               
                String a=input.next();
                
                if(a.equals("E")||a.equals("e")){
                    sayi= (int) (Math.random() * 100);
                    isWin=false;
                    hak=7;

                }else{
                    break;
                }

            }

        }
        input.close();
    }
}