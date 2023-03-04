import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x / y);

        } catch (Exception e) {
        e.printStackTrace();

        } finally {
            input.close();
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

}
