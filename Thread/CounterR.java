package Thread;

public class CounterR implements Runnable {
    private String name;
    private int wait;
    private boolean isrun=true;

    public boolean isIsrun() {
        return isrun;
    }

    public void setIsrun(boolean isrun) {
        this.isrun = isrun;
    }

    public CounterR(String name, int wait) {
        this.name = name;
        this.wait = wait;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Çalıştı");
        int i = 0;
        while (isrun) {
            i=i+1;
            System.out.println(this.getName() + " :" + i++ + "  ");
            try {

                Thread.sleep(1000 * wait);

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
          

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop() {
        isrun = false;
    }
}
