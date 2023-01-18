public class Recursive {

    static int f(int i) {
        System.out.println("i nin değeri: "+i);
        if (i == 0) {
            return 1;
        } else {
            return f(i - 1) *i;
        }
    }

    public static void main(String[] args) {
int result=f(6);
System.out.println(result);
    }
}
