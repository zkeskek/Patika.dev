import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1,s2,select;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        s1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        s2=input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiminiz: ");
        select=input.nextInt();

        switch (select) {
            case 1:
               System.out.println("toplam="+ (s1+s2)); 
            break;
            case 2:
            System.out.println("çıkarma="+ (s1-s2)); 
    
            break;
            case 3:
            System.out.println("çarpma="+ (s1*s2)); 
  
            break;
            case 4:
            System.out.println("bölme="+ (s1/s2)); 
  
            break;
    
    
            default:
            System.out.println("Yanlış seçim yaptınız"); 

                break;
        }
        input.close();  
    }
}
