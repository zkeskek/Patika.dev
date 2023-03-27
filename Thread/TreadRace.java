package Thread;

import java.util.ArrayList;
import java.util.List;

public class TreadRace implements Runnable {
    private List arr;
    private static List listOdd = new ArrayList<>();
    private static List listEven = new ArrayList<>();
    private final Object LOCK = new Object();

    public TreadRace(List arr) {
        this.arr = arr;
    }

    public TreadRace() {
    }

    @Override
    public void run() {

        synchronized (LOCK) {

            for (int i = 0; i < arr.size(); i++) {
                if ((int) this.arr.get(i) % 2 == 0) {

                    listEven.add((int) this.arr.get(i));

                } else {
                    listOdd.add((int) this.arr.get(i));
                }

            }

        }
        
        
       // System.out.println(listEven);
       // System.out.println(listOdd);

    }

    public List getArr() {
        return arr;
    }

    public void setArr(List arr) {
        this.arr = arr;
    }

    public static List getListOdd() {
        return listOdd;
    }

    public void setListOdd(List listOdd) {
        this.listOdd = listOdd;
    }

    public static List getListEven() {
        return listEven;
    }

    public void setListEven(List listEven) {
        this.listEven = listEven;
    }

}