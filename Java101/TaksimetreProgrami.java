import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double tutar;
        System.out.println("Km bilgisini giriniz:");
        Scanner input=new Scanner(System.in);
        km=input.nextInt();
        tutar=10+km*2.2;
        if (tutar>20){
            System.out.println("Taksimetre Tutarı:"+tutar+" TL");
        }else{
            System.out.println("Taksimetre Tutarı:"+20+" TL");
        }
        input.close();
    }
}
