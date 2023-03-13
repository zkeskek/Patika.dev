package Queue;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private String name;
    private double CGPA;
    private int ID;

    public Student(String name, double CGPA, int ID) {
        this.name = name;
        this.CGPA = CGPA;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCGPA() {
        return CGPA;
    }

    public void setCCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < events.size(); i++) {
            String[] event = events.get(i).split(" ");
            if (event[0].equals("ENTER")) {
                students.add(new Student(event[1], Double.valueOf(event[2]), Integer.valueOf(event[3])));
            } else {
                Collections.sort(students, new studentComparetor());
                if (students.size() > 0) {
                    students.remove(0);
                }
            }

        }

        return students;
    }

}

class studentComparetor implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.getCGPA(), s1.getCGPA())==0) {
            if (s1.getName().compareTo(s2.getName())==0) {
                
                return s1.getID() - s2.getID();
            } else {
                
                return s1.getName().compareTo(s2.getName());
            }
        } else {
            
            return Double.compare(s2.getCGPA(), s1.getCGPA());
        }
    }
}

public class Solution2 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    /**
     *
     */

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}