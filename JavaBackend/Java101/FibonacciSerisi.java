/**
 * FibonacciSerisi
 */
public class FibonacciSerisi {

    public static void main(String[] args) {
        int n = 20;
        long fibonacci, fibonacci1=0, fibonacci2=1;
        System.out.println("fibonacci serisi");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci = 0;
                System.out.println(fibonacci + " oran: " + (double) fibonacci / (double) fibonacci2);
                fibonacci2=fibonacci;

            } else if(i==1){
                fibonacci = 1;
                fibonacci2=fibonacci;
                fibonacci1=0;
                System.out.println(fibonacci + " oran: " + (double) fibonacci / (double) fibonacci2);

            }else{
                fibonacci = fibonacci2+fibonacci1 ;
                System.out.println(fibonacci + " oran: " + (double) fibonacci / (double) fibonacci2);

                fibonacci1 = fibonacci2;
                fibonacci2=fibonacci;

            }
        }
    }
}