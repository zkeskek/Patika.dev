import java.util.Scanner;

public class GirilenSayidanKucuk4_5KuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayiyi giriniz");
        n=input.nextInt();
        System.out.print("4 ve 5 in katları:");
        for(int i=1;i<=n;i*=20){
            
                System.out.print(i+" ");
            
        }
        input.close(); 
    }
}
