package Thread;

import java.util.ArrayList;
import java.util.List;

public class TreadRaceMain {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list10 = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            list10.add(i);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        list1 = list10.subList(0, 2500);
        list2 = list10.subList(2500, 5000);
        list3 = list10.subList(5000, 7500);
        list4 = list10.subList(7500, 10000);

        List list = new ArrayList<>(new ArrayList<>());

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        System.out.println("...1 to 1000 Arraylist..............................");
        //System.out.println("List : " + list10);
        System.out.println("List  size : " + list10.size());
        TreadRace race1 = new TreadRace(list1);
        TreadRace race2 = new TreadRace(list2);
        TreadRace race3 = new TreadRace(list3);
        TreadRace race4 = new TreadRace(list4);
        System.out.println("..............................");
        System.out.println("List1 size : " + list1.size());
        System.out.println("List2 size : " + list2.size());
        System.out.println("List3 size : " + list3.size());
        System.out.println("List4 size : " + list4.size());
        System.out.println("..............................");

        Thread t1 = new Thread(race1);
        Thread t2 = new Thread(race2);
        Thread t3 = new Thread(race3);
        Thread t4 = new Thread(race4);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        t4.start();
        t4.join();

        /*
         * Thread.sleep(1000);
         * listOdd.addAll(race1.getListOdd());
         * listOdd.addAll(race2.getListOdd());
         * listOdd.addAll(race3.getListOdd());
         * listOdd.addAll(race4.getListOdd());
         * 
         * listEven.addAll(race1.getListEven());
         * listEven.addAll(race2.getListEven());
         * listEven.addAll(race3.getListEven());
         * listEven.addAll(race4.getListEven());
         * 
         * System.out.println(race1.getListOdd());
         * System.out.println(race2.getListOdd());
         * System.out.println(race3.getListOdd());
         * System.out.println(race4.getListOdd());
         * 
         * System.out.println(race1.getListEven());
         * System.out.println(race2.getListEven());
         * System.out.println(race3.getListEven());
         * System.out.println(race4.getListEven());
         * 
         * System.out.println("Listeven : " + listEven);
         * System.out.println("Listodd : " + listOdd);
         */
        Thread.sleep(0);
        System.out.println("Listeven :.............................................\n " + TreadRace.getListEven());
        System.out.println("Listodd  :.............................................\n " + TreadRace.getListOdd());
        System.out.println("..............................");


        System.out.println("Listeven  size : "+TreadRace.getListEven().size());
        System.out.println("Listodd   size : "+TreadRace.getListOdd().size());
    }

}
