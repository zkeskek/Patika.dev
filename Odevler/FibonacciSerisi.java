/**
 * FibonacciSerisi
 */
public class FibonacciSerisi {

    public static void main(String[] args) {
        int n=80;
        long fibonacci=0,fibonacci1=0,fibonacci2=1;
        System.out.println("fibonacci serisi");
        for(int i=0;i<=n;i++){
           fibonacci=fibonacci1+fibonacci2;
           fibonacci1=fibonacci2;
           fibonacci2=fibonacci;
        
            System.out.println(fibonacci+" oran: "+(double)fibonacci2/(double)fibonacci1);
        }
    }
}