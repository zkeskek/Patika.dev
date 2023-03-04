package ArrayList;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        List<Integer> liste1 = new ArrayList<>();
        List<Integer> liste2 = new ArrayList<>();
        // ArrayList<Integer> liste=new ArrayList<>();

        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(5);
        liste.add(null);
        liste.add(7);
        liste.add(9);
        liste.add(10);
        liste.add(1);
        liste.add(6);
        liste.add(10);
        System.out.println("---------direct çıktı--------");
        System.out.println(liste);

        System.out.println("---------Iterator çıktı--------");

        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------foreach çıktı--------");

        for (Integer e : liste) {
            System.out.println(e);

        }
        System.out.println("---------size--------");
        System.out.println(liste.size());

        System.out.println("---------index of 1--------");
        System.out.println(liste.indexOf(1));

        System.out.println("---------lastindex of 1--------");
        System.out.println(liste.lastIndexOf(1));

        System.out.println("---------index 11--------");
        System.out.println(liste.indexOf(11));

        System.out.println("---------add --------");
        liste.add(2, 15);
        for (Integer e : liste) {
            System.out.println(e);

        }

        System.out.println("---------set--------");
        liste.set(3, 15);
        for (Integer e : liste) {
            System.out.println(e);

        }

        System.out.println("---------contains 9, 11--------");
        System.out.println(liste.contains(9));
        System.out.println(liste.contains(11));

        System.out.println("---------remove- (index 9)-------");
        System.out.println(liste.remove(9));
        System.out.print("--------(index 9) silindi-------: ");
        for (Integer e : liste) {
            System.out.println(e);
        }

        System.out.println("--------liste liste1 e aktarma-------: ");
        System.out.println(liste);
        liste1.add(100);
        System.out.println(liste1);
        liste1.addAll(liste);
        System.out.println(liste1);

        System.out.println("--------liste den sublist oluşturma-2,3------: ");
        System.out.println(liste);
        liste2 = liste.subList(2, 5);
        System.out.println(liste2);

        System.out.println("--------liste.toArray()------: ");
        System.out.println(liste.toArray());

        System.out.println("--------liste.toString()------: ");
        System.out.println(liste.toString());

        System.out.println("--------liste.clear()------: ");

        liste.clear();
        System.out.println(liste);

    }
}
