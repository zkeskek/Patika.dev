package Treemapx;

public class Student {
    private int key;
    private String name;
    private int note;

    public Student(int key, String name, int note) {
        this.key = key;
        this.name = name;
        this.note = note;
    }

       
    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }


    public int getKey() {
        return key;
    }


    public void setKey(int key) {
        this.key = key;
    }
    
}
