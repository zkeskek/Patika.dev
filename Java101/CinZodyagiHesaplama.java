import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int yil;
        
        Scanner input=new Scanner(System.in);
       
        System.out.println("Doğduğunuz yılınızı giriniz");
        yil=input.nextInt();
       

        
        if(yil%12==0){System.out.println("Burcunuz maymun");}
        if(yil%12==1){System.out.println("Burcunuz horoz");}
        if(yil%12==2){System.out.println("Burcunuz köpek");}
        if(yil%12==3){System.out.println("Burcunuz domuz");}
        if(yil%12==4){System.out.println("Burcunuz fare");}
        if(yil%12==5){System.out.println("Burcunuz öküz");}
        if(yil%12==6){System.out.println("Burcunuz kaplan");}
        if(yil%12==7){System.out.println("Burcunuz tavşan");}
        if(yil%12==8){System.out.println("Burcunuz ejderha");}
        if(yil%12==9){System.out.println("Burcunuz yılan");}
        if(yil%12==10){System.out.println("Burcunuz at");}
        if(yil%12==11){System.out.println("Burcunuz koyun");}
        input.close();
       
    }
}
