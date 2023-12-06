package language.Threads;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i =10;i>0;i--){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread number one is finished");
    }
}
