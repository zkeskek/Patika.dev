package PatikaStore;

import java.util.Iterator;

public class Notebook extends Store {
    private int indirim;

    public Notebook() {
    }

    public Notebook(int indirim) {
        this.indirim = indirim;
    }

    public Notebook(int id, String urunName, double birimfiyat, String marka, int depolama, double ekranboyu, int ram,
            int indirim) {
        super(id, urunName, birimfiyat, marka, depolama, ekranboyu, ram);
        this.indirim = indirim;
    }

    public int getIndirim() {
        return indirim;
    }

    public void setIndirim(int indirim) {
        this.indirim = indirim;
    }

    public Iterator<Notebook> iterator() {
        return null;
    }

    
}
