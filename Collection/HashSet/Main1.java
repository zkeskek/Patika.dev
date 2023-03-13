package HashSet;



import java.util.*;;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(10);
        hset.add(20);
        hset.add(10);
        hset.add(30);
        hset.add(10);
        hset.add(10);
        hset.add(null);
        hset.add(30);
        System.out.println(hset.size());
        System.out.println(hset.isEmpty());
        System.out.println(hset.contains(20));
        //System.out.println(hset.remove(10));
        //hset.clear();


        Iterator<Integer> itr=hset.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}

        for (Integer sayi : hset) {
            System.out.println(sayi);
            
        }
    }
}