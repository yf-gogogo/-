package chapter1;

public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo( String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running " +  threadName );
        //第一个测试案例
        /*Singleton.getInstance();*/

        //第二个测试案例
        /*ChocolateFactory chocolateFactory = ChocolateFactory.getInstance();
        chocolateFactory.fill();
        chocolateFactory.boil();
        chocolateFactory.drain();*/

        //第三个测试案例
        ChocolateFactory1 chocolateFactory1 = ChocolateFactory1.getInstance();
        synchronized (this){
            chocolateFactory1.fill();
            chocolateFactory1.boil();
            chocolateFactory1.drain();
        }

        System.out.println( threadName + " exit.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
