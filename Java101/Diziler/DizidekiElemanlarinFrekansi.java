import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
        
        
        int frekans = 0;

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && dizi[i] > -1) {
                    frekans = frekans + 1;
                    if(j>i){
                        dizi[j]=-1;
                    }
                    
                }

            }
            if(dizi[i]>-1){
            System.out.println(dizi[i] + " sayısı " + frekans + " kere tekrar edildi.");
            }
            frekans = 0;
        }

    }
}
