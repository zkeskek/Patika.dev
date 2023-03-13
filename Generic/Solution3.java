

public class Solution3 {

   
    public static void main(String[] args) {

        Integer[] num = { 1, 2, 3 };
        String[] str = { "Hello", "World" };

        PrintArray<Integer> printInt = new PrintArray<>(num);

        PrintArray<String> printStr = new PrintArray<>(str);

        printInt.printArr();
        printStr.printArr();
    }
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */

}

class PrintArray<T> {
    T[] value;

    public PrintArray(T[] value) {
        this.value = value;
    }

    public void printArr() {
        for (int i = 0; i < value.length; i++) {

            System.out.println(value[i]);

        }

    }

    public T[] getValue() {
        return value;
    }

    public void setValue(T[] value) {
        this.value = value;
    }

}