package HashSet.lLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhset=new LinkedHashSet<>();
        lhset.add(20);
        lhset.add(10);
        lhset.add(20);
        lhset.add(10);
        lhset.add(20);
        lhset.add(10);
        lhset.add(30);
        lhset.add(20);
        lhset.add(30);
        lhset.add(10);
        Iterator<Integer> itr=lhset.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            
        };


        
    }
}
