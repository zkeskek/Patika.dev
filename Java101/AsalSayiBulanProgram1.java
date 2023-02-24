public class AsalSayiBulanProgram1 {
    static int asalSayi(int x, int y) {

        if (y == 2) {
            System.out.println(x+" asal sayıdır");
            return 2;
            
        }
        if(x%(y-1)==0){
            System.out.println(x+" asal değil");
            return 2;
        }

        return asalSayi(x, y - 1);
    }

    public static void main(String[] args) {
        asalSayi(13, 13);

    }
}
