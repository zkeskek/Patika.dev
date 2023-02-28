package Mylist;

public class MyList<T> {
    private Object[] arr;
    private int capacity = 10, index = 0;
    private T data;

    public MyList() {
        this.arr = new Object[this.capacity];

    }

    public MyList(int capacity) {
        this.arr = new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (Object object : arr) {
            if (object != null) {
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T data) {
        this.data = data;
        if (size() < capacity) {
            this.arr[size()] = this.data;
        } else {
            increaseArrayCapacity();
            this.arr[size()] = this.data;
        }

    }

    private void increaseArrayCapacity() {
        Object[] temparr = new Object[capacity * 2];

        for (int index = 0; index < this.arr.length; index++) {
            temparr[index] = arr[index];
        }
        this.arr = new Object[(capacity * 2)];
        arr = temparr;

    }

    public Object get(int index) {

        if (index >= this.arr.length || index < 0) {
            return null;
        }
        return this.arr[index];
    }

    public void remove(int index) {
        if (index >= this.arr.length || index < 0) {
            System.out.println("null");
        }
        int temp;
        for (int i = index; i < this.arr.length - 1; i++) {
            if (this.arr[i + 1] != null) {
                temp = (int) this.arr[i + 1];
                this.arr[i + 1] = null;
                this.arr[i] = temp;
            } else {
                this.arr[i] = null;
                break;
            }

        }
    }

    public void set(int index, T data) {

        if (index >= this.arr.length || index < 0) {
            System.out.println("null");
        } else {
            this.arr[index] = (int) data;
        }

    }

    public String toString() {
        String str = "";
        for (Object obj : this.arr) {
            if (obj != null) {
                if (str.equals("")) {
                    str = "" + obj;
                } else {
                    str = str + "," + obj;
                }

               
            }

        }

        return "[" + str + "]";
    }

    public boolean isEmpty() {
        boolean bool = true;
        for (Object a : arr) {
            if (a != null) {
                bool = false;
            }
        }
        return bool;
    }

    public int indexOf(T data) {
        int count = 0;
        for (Object a : arr) {
            if (a != null) {
                if (a == data) {
                    return count;
                }
                count++;
            }

        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int count = 0;
        int index = -1;
        for (Object a : arr) {
            if (a != null) {
                if (a == data) {
                    index = count;
                }
                count++;
            }
        }
        return index;
    }

    public Object[] toArray() {
        Object[] arr2 = new Object[size()];
        int index1 = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != null) {
                arr2[index1] = arr[index];
                index1++;
            }
        }
        return arr2;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subarr = new MyList<>();

        int index1 = 0;
        for (int index = start; index <= finish; index++) {
            if (index >= 0 && index < arr.length) {
                if (arr[index] != null) {
                    subarr.arr[index1] = arr[index];
                    index1++;
                }
            }
        }
        return subarr;
    }

    public boolean contains(T data) {
        for (Object obj : arr) {
            if (data == obj) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        arr = new Object[capacity];

    }
    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
