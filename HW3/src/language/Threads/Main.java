package language.Threads;

public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer con1 = new Consumer(buffer);
        Consumer con2 = new Consumer(buffer);
        Consumer con3 = new Consumer(buffer);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(con1);
        Thread t3 = new Thread(con2);
        Thread t4 = new Thread(con3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

	// write your code here
    }
}
