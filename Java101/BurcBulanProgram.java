import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay,gun;
        
        Scanner input=new Scanner(System.in);
       
        System.out.println("Doğduğunuz ayı giriniz");
        ay=input.nextInt();
        System.out.println("Doğduğunuz günü giriniz");
        gun=input.nextInt();

        
        if(ay==3&&gun>=21||ay==4&&gun<=20){System.out.println("Burcunuz Koç");}
        if(ay==4&&gun>=21||ay==5&&gun<=21){System.out.println("Burcunuz boğa");}
        if(ay==5&&gun>=22||ay==6&&gun<=22){System.out.println("Burcunuz ikizler");}
        if(ay==6&&gun>=23||ay==7&&gun<=22){System.out.println("Burcunuz yengeç");}
        if(ay==7&&gun>=23||ay==8&&gun<=22){System.out.println("Burcunuz aslan");}
        if(ay==8&&gun>=23||ay==9&&gun<=22){System.out.println("Burcunuz başak");}
        if(ay==9&&gun>=23||ay==10&&gun<=22){System.out.println("Burcunuz terazi");}
        if(ay==10&&gun>=23||ay==11&&gun<=21){System.out.println("Burcunuz akrep");}
        if(ay==11&&gun>=22||ay==12&&gun<=21){System.out.println("Burcunuz yay");}
        if(ay==12&&gun>=22||ay==1&&gun<=21){System.out.println("Burcunuz oğlak");}
        if(ay==1&&gun>=22||ay==2&&gun<=19){System.out.println("Burcunuz Kova");}
        if(ay==2&&gun>=20||ay==3&&gun<=20){System.out.println("Burcunuz Balık");}
        input.close();
    }
}
