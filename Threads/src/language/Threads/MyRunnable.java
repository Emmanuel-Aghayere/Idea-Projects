package language.Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread number two is finished");
    }
}


