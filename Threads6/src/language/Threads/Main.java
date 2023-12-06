package language.Threads;

import static language.Threads.ThreadColor.*;


public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"Hello from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_BLUE+"Hello from anonymus thread");
            }
        }.start();
        Thread ourRunnableThread = new Thread(new OurRunnable()){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN +"Hello from the anonymous class's implementation of run().");
            }
        };
        ourRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_RED+"Hello again from the main thread");
        Thread anotherThread1 = new AnotherThread();
        anotherThread1.setName("==Another Thread==");
        anotherThread1.start();
        new Thread(){
            public void run(){
                System.out.println(ANSI_BLUE + "Hello from anonymus");
            }
        }.start();
        Thread ourRunnThread = new Thread(new OurRunnable(){
            @Override
            public void run(){
                System.out.println(ANSI_BLUE+"Hello from the class ...");


    }
});
    }}
