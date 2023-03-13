package TreeSet;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("...........Nota göre sıralama...........");

        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        students.add(new Student("Mustafa", 50));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Mustafa", 50));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 61));
        for (Student stu : students) {
            System.out.println(stu.getName() + "\t " + stu.getNote());

        }
        System.out.println("...........İsme göre sıralama...........");
        TreeSet<Student> students1 = new TreeSet<>(new OrderNameComparator());
        students1 = students;
        /*
         * students1.add(new Student("Mustafa", 50));
         * students1.add(new Student("Ahmet", 100));
         * students1.add(new Student("Behlül", 45));
         * students1.add(new Student("Mustafa", 50));
         * students1.add(new Student("Damla", 60));
         * students1.add(new Student("Cemre", 61));
         */
        for (Student stu : students1) {
            System.out.println(stu.getName());

        }
    }

}
