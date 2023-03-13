package Treemapx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main3 {
    public static void main(String[] args) {
        
System.out.println("HashMap-------------------------");
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(101, new Student(101,"Mustafa", 50));
        students.put(103, new Student(103, "Ahmet", 100));
        students.put(102, new Student(102, "Behlül", 45));
        students.put(110, new Student(110, "Mustafa", 50));
        students.put(109, new Student(109, "Damla", 60));
        students.put(105, new Student(105,"Cemre", 61));
        for (Student stu : students.values()) {
            System.out.println(stu.getKey() + "\t" + stu.getName() + "\t" + stu.getNote());

        }
        System.out.println("Linked HashMap-------------------------");

        LinkedHashMap<Integer, Student> lstudents = new LinkedHashMap<>();
        lstudents.put(101, new Student(101,"Mustafa", 50));
        lstudents.put(103, new Student(103, "Ahmet", 100));
        lstudents.put(102, new Student(102, "Behlül", 45));
        lstudents.put(110, new Student(110, "Mustafa", 50));
        lstudents.put(109, new Student(109, "Damla", 60));
        lstudents.put(105, new Student(105,"Cemre", 61));
        for (Student stu : lstudents.values()) {
            System.out.println(stu.getKey() + "\t" + stu.getName() + "\t" + stu.getNote());

        }
        System.out.println("TreeMap-------------------------");

        TreeMap<Integer, Student> tstudents = new TreeMap<>(new OrderByNoComparator());
        tstudents.put(101, new Student(101,"Mustafa", 50));
        tstudents.put(103, new Student(103, "Ahmet", 100));
        tstudents.put(102, new Student(102, "Behlül", 45));
        tstudents.put(110, new Student(110, "Mustafa", 50));
        tstudents.put(109, new Student(109, "Damla", 60));
        tstudents.put(105, new Student(105,"Cemre", 61));
        for (Student stu : tstudents.values()) {
            System.out.println(stu.getKey() + "\t" + stu.getName() + "\t" + stu.getNote());

        }

    }
}
