package HackerRank;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> d1Liste = new ArrayList<>();
        List<Integer> dListe = new ArrayList<>();
        List<Integer> qListe = new ArrayList<>();

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            d1Liste.add(d);
            while (d > 0) {
                dListe.add(input.nextInt());
                d = d - 1;
            }
        }
        n = input.nextInt();

        for (int i = 0; i < n; i++) {

            qListe.add(input.nextInt());
            qListe.add(input.nextInt());
        }
        System.out.println(d1Liste);
        System.out.println(dListe);
        System.out.println(qListe);

        for (int i = 0; i < n * 2; i = i + 2) {
            int x = qListe.get(i);
            int y = qListe.get(i + 1);
            if (y > d1Liste.get(x - 1)) {
                System.out.println("ERROR!");
            } else {
                int z = 0;
                for (int j = 0; j < x - 1; j++) {
                    z = z + d1Liste.get(j);

                }
                System.out.println(dListe.get(z + y - 1));
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        input.close();
    }
}