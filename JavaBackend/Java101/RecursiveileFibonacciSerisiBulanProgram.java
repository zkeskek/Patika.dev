public class RecursiveileFibonacciSerisiBulanProgram {
    static int fonksiyon(int i){
        int result;
        if(i<4){
            return 1;

        }else{
            result=fonksiyon(i-1)+fonksiyon(i-2);
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(fonksiyon(20));
    }
}
