import java.util.Arrays;

public class DizidekiTekrarEdenSayilariBulanProgram {
    public static void main(String[] args) {
        int[] list = new int[100];
        int[] listx = new int[100]; 
        int[] listc = new int[100]; 
        int[] listt = new int[100]; 
        
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int j = 0,k=0,l=0;
        for (int i = 0; i < list.length; i++) {

            if(list[i]%2==0){
                listc[k]=list[i];
                k=k+1;

            }else{
                listt[l]=list[i];
                l=l+1;
            }

            if (i < list.length - 1) {
                if (list[i] == list[i + 1]) {
                    listx[j] = list[i];

                    j = j + 1;
                    continue;
                }
            }
            if (i > 0) {
                if (list[i] == list[i - 1]) {
                    listx[j] = list[i];


                    j = j + 1;
                    continue;
                }
            }

        }

        System.out.println("\nTekrar eden sayılar: \n"+Arrays.toString(listx));
        System.out.println("\nÇift sayılar: \n"+Arrays.toString(listc));
        System.out.println("\nTek sayılar: \n"+Arrays.toString(listt));
    }

}
